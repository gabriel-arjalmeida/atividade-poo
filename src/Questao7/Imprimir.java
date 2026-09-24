package Questao7;

public class Imprimir implements ProcessadorRelatorios{
    private Relatorio relatorio;

    public Imprimir() {
    }

    public Relatorio getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public void processarRelatorio(Relatorio relatorio) {
        System.out.println("Imprimindo o "+relatorio.getTitulo()+"...");

    }
}
