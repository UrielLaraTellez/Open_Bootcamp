inicio: int = int(input ("Introduzca el inicio: "))
fin: int = int(input ("Introduzca el numero final: "))
impares= []

for i in range(inicio , fin+1) :
    if i % 2 != 0 :
        impares.append(i)

print (impares)
