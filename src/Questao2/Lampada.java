package Questao2;

public class Lampada implements Controlavel {
    private boolean ligado = false;

    private int brilho = 100;

    public Lampada(boolean ligado,int brilho) {
        this.ligado = ligado;
        this.brilho = brilho;
    }

    @Override
    public void ligar() {
        ligado = true;
        brilho = 100;
    }

    @Override
    public void desligar() {
        ligado = false;
        brilho = 0;
    }

}
