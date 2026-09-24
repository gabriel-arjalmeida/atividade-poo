package Questao1;

import java.util.List;

public class Pedido {
    private Entrega entrega;

    public Pedido(Entrega entrega) {
        this.entrega = entrega;
    }
    public double precoEntrega() {
        return entrega.calcularPreco();
    }
}
