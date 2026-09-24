package Questao3;

import java.time.LocalDate;


public class Emprestimo {
    private LocalDate dataInicio;
    private LocalDate dataDevolucao;
    private Livro livro;
    private Leitor leitor;

    public Emprestimo(Leitor leitor,LocalDate dataInicio, Livro livro) {
        this.dataInicio = dataInicio;
        this.dataDevolucao = dataInicio.plusDays(10);
        this.livro = livro;
        this.leitor = leitor;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataInicio=" + dataInicio +
                ", dataDevolucao=" + dataDevolucao +
                ", livro=" + livro +
                ", leitor=" + leitor +
                '}';
    }
}
