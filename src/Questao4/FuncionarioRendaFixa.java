package Questao4;

public class FuncionarioRendaFixa extends Funcionario{
    public int horasTrabalhadas;
    public FuncionarioRendaFixa(String nome, int matricula, int horasTrabalhadas) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;

    }
    public double salario(){
        return 8.0 * (double)horasTrabalhadas;
    }

}
