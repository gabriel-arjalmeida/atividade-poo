package Questao6;

public class Onibus extends VeiculoTerrestre{

    public Onibus(int identificacao, boolean ligado, boolean temCombustivel, int capacidadeCarga) {
        super(identificacao, ligado, temCombustivel, capacidadeCarga);
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
}
