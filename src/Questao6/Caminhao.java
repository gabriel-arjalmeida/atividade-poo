package Questao6;

public class Caminhao extends VeiculoTerrestre{
    private double capacidadeCarga;

    public Caminhao(int identificacao, boolean ligado, boolean temCombustivel, double capacidadeCarga) {
        super(identificacao, ligado, temCombustivel);
        this.capacidadeCarga = capacidadeCarga;
    }
    @Override
    public void iniciar() {
        if(isTemCombustivel()){
            setLigado(true);
            System.out.println("Ligando o caminhao " + getIdentificacao());
        }
        else{
            setLigado(false);
            System.out.println("Combustivel insuficiente!");
        }
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
