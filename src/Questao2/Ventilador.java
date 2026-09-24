package Questao2;

import jdk.swing.interop.SwingInterOpUtils;

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
        System.out.println(ligado);
        System.out.println(potencia);
    }

    @Override
    public void desligar() {
        this.ligado = false;
        this.potencia = 0;
        System.out.println(ligado);
        System.out.println(potencia);
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
