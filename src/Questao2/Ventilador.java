package Questao2;

public class Ventilador implements Controlavel {
    private boolean ligado = false;

    private int potencia = 0;

    public Ventilador(boolean ligado, int potencia) {
        this.ligado = ligado;
        this.potencia = potencia;
    }

    @Override
    public void ligar() {
        this.ligado = true;
        potencia = 3;
    }

    @Override
    public void desligar() {
        this.ligado = false;
        this.potencia = 0;

    }

}
