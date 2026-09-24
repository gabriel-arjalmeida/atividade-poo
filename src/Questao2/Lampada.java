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
        System.out.println(ligado);
        System.out.println(brilho);
    }

    @Override
    public void desligar() {
        ligado = false;
        brilho = 0;
        System.out.println(ligado);
        System.out.println(brilho);
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getBrilho() {
        return brilho;
    }

    public void setBrilho(int brilho) {
        this.brilho = brilho;
    }
}
