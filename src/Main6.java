import Questao6.*;

public class Main6 {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Onibus(110,false,true,2000);
        Veiculo veiculo2 = new Caminhao(1113,false,true,13000);
        Veiculo veiculo3= new Drone(100,001);

        veiculo1.iniciar();
        veiculo2.iniciar();
        veiculo3.iniciar();

    }
}
