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
        }
        else{
            setLigado(false);
        }
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
