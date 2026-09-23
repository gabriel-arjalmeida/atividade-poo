package Questao7;

public class Imprimir implements ProcessadorRelatorios{
    private Relatorio relatorio;

    public Imprimir(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    public Relatorio getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public void processarRelatorio() {
        System.out.println("Imprimindo o "+relatorio.getTitulo()+"...");

    }
}
