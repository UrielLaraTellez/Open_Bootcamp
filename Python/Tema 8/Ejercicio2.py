from msilib.schema import Class
from tokenize import PseudoExtras
from pickle import *


class Vehiculo:
    puertas = 4

    def __init__(self, puertas):
        self.puertas = puertas
    
    def getPuertas(self):
        return self.puertas

carro = Vehiculo (5)

f = open('Datos','w+b')
dump(carro,f)

f.seek(0)
nuevo_carro = load(f)
print(nuevo_carro)
f.close