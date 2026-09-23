import Questao7.*;

public class Main7 {
    public static void main(String[] args) {
        Relatorio relatorio1 = new Relatorio("arquvivos confidenciais","blablabla");
        ProcessadorRelatorios processador1 = new EnviarEmail(relatorio1);
        ProcessadorRelatorios processador2 = new Imprimir(relatorio1);
        ProcessadorRelatorios processador3 = new SalvarArquivo(relatorio1);

        processador1.processarRelatorio();
        processador2.processarRelatorio();
        processador3.processarRelatorio();
    }
}
