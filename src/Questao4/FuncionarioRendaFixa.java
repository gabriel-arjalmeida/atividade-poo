package Questao4;

public class FuncionarioRendaFixa extends Funcionario{
    public double salarioFixo;
    public FuncionarioRendaFixa(String nome, int matricula, double salarioFixo) {
        super(nome, matricula);
        this.salarioFixo = salarioFixo;

    }
    public double salario(){
        return salarioFixo;
    }

}
