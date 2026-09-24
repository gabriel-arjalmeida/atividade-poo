package Questao6;

public class Drone implements Veiculo{
    private  int identificacao;
    private int nivelBateria = 100;
    private boolean ligado = false;

    public Drone(int nivelBateria,int identificacao) {
        this.nivelBateria = nivelBateria;
        this.identificacao = identificacao;
    }

    @Override
    public void iniciar() {
        if(nivelBateria != 0){
            ligado = true;
        }
        else{
            ligado = false;
        }
    }

}
