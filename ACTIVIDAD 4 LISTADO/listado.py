print("1-REALIZAR FUNCIONES DEL MENU\n2-SALIR ")
m=int(input())
while(m!=0 or l!=5):
    if (m==1):
        print("diga que opcion del menu quiere realizar: \n1-Crear persona.\n2-Eliminar persona.\n3-Listar persona.\n4-Buscar persona.\n5-salir")
        l =int(input())
        if(l==1):
            lista1=list()
            print("agregale un valor a listado: ")
            lista1.append(input())
            print (lista1)
        
        elif(l==2):
            lista2=list()
            lista2.append("jhon")
            lista2.append("jeick")
            lista2.append("frank")
            print("elimine un valor del menu(recuerda escribir el texto tal cual esta en el menu): ",lista2,"teniendo en cuenta que se enumeran del 0 Al 2")
            lista2.pop(int(input()))
            print(lista2)
        
        elif(l==3):
            lista3=list()
            lista3.append("mery")
            lista3.append("valery")
            lista3.append("yuliana")
            print("listado: ",lista3)
        
        elif(l==4):
            lista4=list()
            lista4.append("mery")
            lista4.append("valery")
            lista4.append("yuliana")
            print("listado: ",lista4)
            print("busca un elemento del listado")
            if input() in lista4:
                print("el elemento se encuentra en la lista")
            else:
                print("el elemento no se encuentra en la lista")
        elif(l==5):
            break        
    elif(m==2):
        break 