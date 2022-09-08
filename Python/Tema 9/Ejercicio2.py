from functools import reduce

lista = list(range(100))

resultadoImpares = list(filter(lambda x : x % 2 , lista))
print(resultadoImpares)

resultadoReduce = reduce(lambda x , y: x+y, resultadoImpares)
print(resultadoReduce)