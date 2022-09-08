package com.ejercicio1;

public class SmartWatch extends SmartDevice{
    int tamanoCorrea;

    public SmartWatch(){

    }

    public SmartWatch(int tamanoPantalla, int botones, int tamanoCorrea) {
        super(tamanoPantalla, botones);
        this.tamanoCorrea = tamanoCorrea;
    }

    @Override
    public String toString() {
        return "tamano pantalla=" + tamanoPantalla +
                ", numero de botones=" + botones +
                ", tamano correa=" + tamanoCorrea ;
    }
}
