
def esPrimo (numero):
    if numero == 0 or numero == 1 or numero == 4:
        return False
    
    
    for i in range (2 , numero):
        if (numero % i) == 0 :
            return False
    return True


numero = int (input ("Introduzca el numero: "))

if esPrimo(numero) == True:
    print ("Es numero primo")
else: print ("No es primo")