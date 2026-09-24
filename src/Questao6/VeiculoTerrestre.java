package Questao6;

public abstract class VeiculoTerrestre implements Veiculo {
    private int identificacao;
    private boolean ligado = false;
    private boolean temCombustivel = true;


    public VeiculoTerrestre(int identificacao, boolean ligado, boolean temCombustivel) {
        this.identificacao = identificacao;
        this.ligado = ligado;
        this.temCombustivel = temCombustivel;
    }

    @Override
    public void iniciar() {

    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTemCombustivel() {
        return temCombustivel;
    }

    public void setTemCombustivel(boolean temCombustivel) {
        this.temCombustivel = temCombustivel;
    }


}
