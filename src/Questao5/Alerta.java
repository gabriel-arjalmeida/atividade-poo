package Questao5;

public class Alerta {
    private String titulo;
    private String conteudo;

    public Alerta(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Nova mensagem: " +
                "titulo='" + titulo + '\'' +
                ", conteudo='" + conteudo + '\'';
    }
}
