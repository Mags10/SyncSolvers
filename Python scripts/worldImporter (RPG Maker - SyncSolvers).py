import json

# Renglones del mapa en rpg maker
ren = 50

# Resolucion del mapa de colisiones a exportar en codigo de greenfoot
width = 2000
height = 1200

# Cadena de codigo
code = ""
plataforms = 0

#open the file to read data
with open("C:\\Users\\alex_\\Desktop\\Map003.json") as json_file:
    data = json.load(json_file)
    # Obtiene los valores del mapa
    values = data['data']
    # Elimina la primera mitad de los valores sin información
    values = values[values.__len__()//2:values.__len__()]
    # De lo restante elimina las ultimas 2/3 partes que no tienen información
    values = values[:values.__len__()//3]
    # Obtiene el numero de columnas segun el numero de valores y renglones
    col = values.__len__()//ren
    for i in range(0, ren):
        j = 0
        while j < col:
            val = values[i*col+j]
            if(val != 0):
                ini = j
                for k in range(j, col):
                    if(values[i*col+k] == 0):
                        fin = k
                        break
                '''
                # Bloque de codigo de ejemplo para exportar en codigo de greenfoot
                ground = new Ground(24 * (fin-ini));
                addObject(ground, 24 * (ini + (fin-ini)/2), 24 * (i + 1));
                '''
                print("fin({})-ini({}): {}".format(fin, ini, fin-ini))
                code += "ground = new Ground({});\n".format(24*(fin-ini))
                code += "addObject(ground, {}, {});\n".format((int)(24*(ini+(fin-ini)/2)), 24*(i+1))
                plataforms += 1
                j = fin
            j += 1
    #guarda el codigo en un archivo
    with open("C:\\Users\\alex_\\Desktop\\Map003.txt", "w") as text_file:
        text_file.write(code)
            
    print("Plataformas: {}".format(plataforms))