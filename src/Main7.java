import Questao7.*;

public class Main7 {
    public static void main(String[] args) {
        Relatorio relatorio1 = new Relatorio("arquvivos confidenciais","blablabla");
        ProcessadorRelatorios processador1 = new EnviarEmail();
        ProcessadorRelatorios processador2 = new Imprimir();
        ProcessadorRelatorios processador3 = new SalvarArquivo();

        processador1.processarRelatorio(relatorio1);
        processador2.processarRelatorio(relatorio1);
        processador3.processarRelatorio(relatorio1);
    }
}
