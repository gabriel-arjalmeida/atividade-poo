package Questao6;

public class Onibus extends VeiculoTerrestre{
    private double capacidadeCarga;

    public Onibus(int identificacao, boolean ligado, boolean temCombustivel, double capacidadeCarga) {
        super(identificacao, ligado, temCombustivel);
        this.capacidadeCarga = capacidadeCarga;
    }
    @Override
    public void iniciar() {
        if(isTemCombustivel()){
            setLigado(true);
            System.out.println("Ligando o onibus "+ getIdentificacao());
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
