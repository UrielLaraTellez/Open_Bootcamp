class Alumno:
    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota
    
    def alumno(self) :
        if self.nota >= 6:
            print ("Felicidades", self.nombre, "aprobaste")
        
        else:
            print ("Lo siento, reprobaste", self.nombre)

alumno1 = Alumno("Juan" , 8)
alumno1.alumno()

alumno2 = Alumno("Maria" , 5)
alumno2.alumno()