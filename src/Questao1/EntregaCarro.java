package Questao1;

public class EntregaCarro extends Entrega{
    private double taxa = 10;
    public EntregaCarro(String destinatario,double distancia, String endereco, double peso) {
        super(destinatario,distancia, endereco, peso);
    }

    @Override
    public double calcularPreco(double distancia, double peso) {
        return (distancia * peso) + 10;
    }


}
