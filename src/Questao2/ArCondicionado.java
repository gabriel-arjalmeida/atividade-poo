package Questao2;

public class ArCondicionado implements Controlavel {
    private boolean ligado = false;
    private double temperatura;

    public ArCondicionado(boolean ligado, double temperatura) {
        this.ligado = ligado;
        this.temperatura = temperatura;
    }

    @Override
    public void ligar() {
        ligado = true;
        temperatura = 15;
    }

    @Override
    public void desligar() {
        ligado = false;
        temperatura = 0;
    }

}
