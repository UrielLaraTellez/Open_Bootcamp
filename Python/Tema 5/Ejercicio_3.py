def Bisiesto():
    year = int (input ("Introduce el anyo: "))

    if year % 4 ==0 and (year % 100 != 0 or year % 400 ==0):
        print ("Es Bisiesto")
    else :
        print("No es bisiesto")

year = Bisiesto ()