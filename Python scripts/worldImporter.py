import json

# Funcion para exportar el codigo de greenfoot de colisiones con un json de rpg maker
# recibe la ubicacion del json y la ubicacion del archivo a exportar ademas de la 
# resolucion del mapa de colisiones y el numero de renglones del mapa de rpg maker.

def exportColitionsMap(jsonPath, exportPath):
    # Renglones del mapa en rpg maker
    ren = 50
    # Resolucion del mapa de colisiones a exportar en codigo de greenfoot
    width = 2000
    height = 1200
    # Cadena de codigo
    code = "Block "
    plataforms = 0

    code2 = "Obstacle "
    obstacles = 0

    #open the file to read data
    with open(jsonPath) as json_file:
        data = json.load(json_file)
        # Obtiene los valores del mapa
        values = data['data']
        values2 = values[:values.__len__()//2]
        values2 = values2[values2.__len__()//3:2*(values2.__len__()//3)]
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
                val2 = values2[i*col+j]
                if (val2 == 3438 or val2 == 3435 or val2 == 3425 or val2 == 3437):
                    # Obstaculo
                    '''
                        Obstacle peak = new Obstacle();
                        addObject(peak, 84, 36);
                    '''
                    #print("i: {}, j: {}, val: {}".format(i, j, val))
                    code2 += "peak = new Obstacle();\n"
                    code2 += "addObject(peak, {}, {});\n".format(24*(j+1) - 12, 24*(i+1) - 12)
                    obstacles += 1
                elif(val != 0):
                    ini = j
                    for k in range(j, col+1):
                        if(values[i*col+k] == 0 or k == col):
                            fin = k
                            break
                    #print("fin({})-ini({}): {}".format(fin, ini, fin-ini))
                    code += "block = new Block({}, {});\n".format(24*(fin-ini), (int)(height/ren))
                    code += "addObject(block, {}, {});\n".format((int)(24*(ini+(fin-ini)/2)), 24*(i+1) - 12)
                    plataforms += 1
                    j = fin
                j += 1
        #guarda el codigo en un archivo
        with open(exportPath, "w") as text_file:
            text_file.write(code)
            text_file.write(code2)
        print("\nCodigo exportado en: {}".format(exportPath))
        print("Plataformas: {}\n".format(plataforms))
        print("Obstaculos: {}\n".format(obstacles))



import sys
jsonPath = sys.argv[1]
exportPath = sys.argv[2]
# Llamar a la funcion
exportColitionsMap(jsonPath, exportPath)