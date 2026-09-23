package Questao4;

public abstract class Funcionario {
    private String nome;
    private int matricula;
    private double Salario;

    public Funcionario(String nome,int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    double salario() {
        return Salario;
    }
}
