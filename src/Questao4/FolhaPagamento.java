package Questao4;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) { funcionarios.add(funcionario); }

    public double calcularSalario() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.salario();
        }
            return total;

    }

}
