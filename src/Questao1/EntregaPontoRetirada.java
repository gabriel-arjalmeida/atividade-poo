package Questao1;

public class EntregaPontoRetirada extends Entrega{


    private double tarifaFixa = 15;
    private double precoKg = 1.50;
    public EntregaPontoRetirada(String destinatario, double distancia, double peso) {
        super(destinatario, distancia, "CorreioDoGabriel", peso);
    }

    @Override
    public double calcularPreco(double distancia, double peso) {
        return (peso * precoKg) + tarifaFixa;
    }

    @Override
    public String getDestinatario() {
        return super.getDestinatario();
    }

    @Override
    public void setDestinatario(String destinatario) {
        super.setDestinatario(destinatario);
    }

    @Override
    public double getDistancia() {
        return super.getDistancia();
    }

    @Override
    public void setDistancia(double distancia) {
        super.setDistancia(distancia);
    }

    @Override
    public double getPeso() {
        return super.getPeso();
    }

    @Override
    public void setPeso(double peso) {
        super.setPeso(peso);
    }
}
