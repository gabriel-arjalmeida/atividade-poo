import Questao4.FolhaPagamento;
import Questao4.Funcionario;
import Questao4.FuncionarioComissao;
import Questao4.FuncionarioRendaFixa;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        funcionarios.add(new FuncionarioRendaFixa("Fidimaria", 676767, 8));
        funcionarios.add(new FuncionarioRendaFixa("Fidipaula", 767676, 8));
        funcionarios.add(new FuncionarioComissao("Fidipamela",696969, 2000.00));

        for(Funcionario funcionario : funcionarios){
            folhaPagamento.adicionarFuncionario(funcionario);
        }
        System.out.println(folhaPagamento.calcularSalario());

    }
}
