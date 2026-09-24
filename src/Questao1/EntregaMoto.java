package Questao1;

public class EntregaMoto extends Entrega{

    public EntregaMoto(String destinatario, double distancia , String endereco, double peso) {
        super(destinatario, distancia, endereco, peso);
    }

    @Override
    public double calcularPreco()
    {
        return getDistancia() * getPeso();
    }


}
