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
            System.out.println("Ligando o drone "+ identificacao);
        }
        else{
            ligado = false;
            System.out.println("Bateria insuficiente! ");
        }
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
