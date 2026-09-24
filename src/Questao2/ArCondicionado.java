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
        System.out.println(ligado);
        System.out.println(temperatura);
    }


    @Override
    public void desligar() {
        ligado = false;
        temperatura = 0;
        System.out.println(ligado);
        System.out.println(temperatura);
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
