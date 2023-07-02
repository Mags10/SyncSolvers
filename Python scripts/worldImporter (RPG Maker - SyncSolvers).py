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
    walls = 0
    #open the file to read data
    with open(jsonPath) as json_file:
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
                    if(fin - ini < 2 and 1 == 0):
                        # Revisar si el bloque puede ser vertical
                        largo = 1
                        for k in range(i, ren):
                            if(values[k*col+ini] != 0):
                                values[k*col+ini] = 0
                                largo += 1
                        print("fin({})-ini({}): {}".format(fin, ini, largo))
                        code += "block = new Block({}, {});\n".format((int)(width/col), 24*(largo))
                        #code += "addObject(block, {}, {});\n".format((int)(24*(ini+(fin-ini)/2)), 24*(i+1) - 12)
                        code += "addObject(block, {}, {});\n".format(24*(largo), (int)(24*(ini+(largo)/2)))
                        walls += 1
                    else:
                        print("fin({})-ini({}): {}".format(fin, ini, fin-ini))
                        code += "block = new Block({}, {});\n".format(24*(fin-ini), (int)(height/ren))
                        code += "addObject(block, {}, {});\n".format((int)(24*(ini+(fin-ini)/2)), 24*(i+1) - 12)
                        plataforms += 1
                        j = fin
                j += 1
        #guarda el codigo en un archivo
        with open(exportPath, "w") as text_file:
            text_file.write(code)
        print("Plataformas: {}".format(plataforms))
        print("Paredes: {}".format(walls))


# Usar la funcion para exportar el codigo de greenfoot
exportColitionsMap("C:/Users/alex_/Desktop/Map003.json", "C:/Users/alex_/Desktop/Mapa.txt")