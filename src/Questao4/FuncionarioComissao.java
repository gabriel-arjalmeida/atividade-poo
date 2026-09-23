package Questao4;

public class FuncionarioComissao extends Funcionario{
    private double totalVendido;
    public FuncionarioComissao(String nome, int matricula,double totalVendido) {
        super(nome, matricula);
        this.totalVendido = totalVendido;
    }
    public double salario(){
        return totalVendido * 0.15;
    }
}
