class Vehiculo:
    color = "verde"
    ruedas = 4
    puertas = 4

class Coche (Vehiculo):
    velocidad = 0
    cilindrada = 8

Camaro = Coche ()
Camaro.color = "azul"
Camaro.velocidad = 200
Camaro.cilindrada = 4 

print ("El camaro es de color: ", Camaro.color, "\n con:", Camaro.ruedas ," ruedas \ncon velocidad:", Camaro.velocidad,
"km/h \ncon cilindrada de:", Camaro.cilindrada, " cilindros \ny:", Camaro.puertas, "puertas")
