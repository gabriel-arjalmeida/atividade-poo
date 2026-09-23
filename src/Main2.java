import Questao2.*;

public class Main2 {
    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador(false,0);

        ArCondicionado ar = new ArCondicionado(false,0);

        Lampada lampada = new Lampada(false,0);


        Painel painel = new Painel();

        painel.ligarDispositivo(ventilador);
        painel.ligarDispositivo(lampada);
        painel.ligarDispositivo(ar);
    }
}
