package Questao4;

public abstract class Funcionario {
    private String nome;
    private int matricula;
    private double Salario;

    public Funcionario(String nome,int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public abstract double salario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}
