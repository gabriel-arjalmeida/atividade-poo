import Questao3.Emprestimo;
import Questao3.Leitor;
import Questao3.Livro;

import java.time.LocalDate;

public class Main3 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Anne Frank","Anne Frank",8897654);

        Emprestimo emprestimo1 = new Emprestimo(new Leitor("Joaozin"), LocalDate.now(),livro1);
        Emprestimo emprestimo2 = new Emprestimo(new Leitor("Luana"),LocalDate.of(2026,9,10),livro1);

        System.out.println(emprestimo1);
        System.out.println(emprestimo2);
    }
}
