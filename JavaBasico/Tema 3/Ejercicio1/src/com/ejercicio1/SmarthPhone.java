package com.ejercicio1;

public class SmarthPhone extends  SmartDevice{
    int numero ;
    int bocina;

    public SmarthPhone(){

    }

    public SmarthPhone(int tamanoPantalla, int botones, int numero, int bocina) {
        super(tamanoPantalla, botones);
        this.numero = numero;
        this.bocina = bocina;
    }

    @Override
    public String toString() {
        return "tamano pantalla=" + tamanoPantalla +
                ", numero de botones=" + botones +
                ", numero=" + numero +
                ", numero de bocinas=" + bocina;
    }
}
