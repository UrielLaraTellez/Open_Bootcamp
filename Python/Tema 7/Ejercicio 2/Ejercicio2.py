import time 

hora = time.strftime('%H')
min= time.strftime('%M')

if (int (hora) >= 19):
    print ("Es hora de irse")

else:
    print ("Faltan: {} horas con {} minutos para salir".format(18-int(hora),59-int(min)))