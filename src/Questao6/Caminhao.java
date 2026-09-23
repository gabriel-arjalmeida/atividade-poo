package Questao6;

public class Caminhao extends VeiculoTerrestre{

    public Caminhao(int identificacao, boolean ligado, boolean temCombustivel, int capacidadeCarga) {
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
