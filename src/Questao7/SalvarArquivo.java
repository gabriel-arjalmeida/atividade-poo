package Questao7;

public class SalvarArquivo implements ProcessadorRelatorios{
    private Relatorio relatorio;

    public SalvarArquivo() {
    }

    public Relatorio getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public void processarRelatorio(Relatorio relatorio) {
        System.out.println("Salvando o relatorio " +relatorio.getTitulo()+"...");
    }
}
