package Questao2;

public class Painel {
    public Painel() {
    }

    public void ligarDispositivo(Controlavel dispositivo) {
        dispositivo.ligar();
        System.out.println("ligado");
    }
    public void desligarDispositivo(Controlavel dispositivo) {
        dispositivo.desligar();
        System.out.println("Desligado");
    }

}
