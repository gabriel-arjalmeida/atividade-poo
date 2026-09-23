package Questao3;

public class Leitor {
    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Leitor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
