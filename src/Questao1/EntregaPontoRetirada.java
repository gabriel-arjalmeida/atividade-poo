package Questao1;

public class EntregaPontoRetirada extends Entrega{


    private double tarifaFixa = 15;
    private double precoKg = 1.50;
    public EntregaPontoRetirada(String destinatario, double distancia, double peso) {
        super(destinatario, distancia, "CorreioDoGabriel", peso);
    }

    @Override
    public double calcularPreco() {
        return (getPeso() * precoKg) + tarifaFixa;
    }


}
