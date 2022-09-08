import math

def aTriangulo (h,b):
    return (h*b)/2

def aCirculo (r):
    return (math.pi*r) **2

h = float (input ("Introduce la altura del triagulo: "))
b = float (input ("Introduce la base del triagulo: "))

r = float (input ("Introduce el radio del circulo: "))

print (aTriangulo(h,b))
print (aCirculo (r))