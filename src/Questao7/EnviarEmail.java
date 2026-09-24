package Questao7;

public class EnviarEmail implements ProcessadorRelatorios{
    private Relatorio relatorio;

    public EnviarEmail() {
    }

    @Override
    public void processarRelatorio(Relatorio relatorio) {
        System.out.println("Enviando o relatorio "+relatorio.getTitulo()+" por email...");
    }

    public Relatorio getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(Relatorio relatorio) {
        this.relatorio = relatorio;
    }
}
