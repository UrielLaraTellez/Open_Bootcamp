
items = input ("Introduce los paises separados por una coma: " )
paises = []
for pais in items.split(','):
    paises.append(pais)

sinrep = set(paises)
ord=sorted(list(sinrep))
print(",".join(ord))
