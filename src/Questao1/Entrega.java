package Questao1;

public  abstract class Entrega {
    private String destinatario;
    private double distancia;
    private double peso;


    public Entrega(String destinatario, double distancia,String endereco, double peso) {
        this.destinatario = destinatario;
        this.distancia = distancia;
        this.peso = peso;
    }


    public abstract double calcularPreco(double distancia,double peso);

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
