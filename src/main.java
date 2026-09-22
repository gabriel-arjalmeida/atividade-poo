import Questao1.*;

public class main {
    public static void main(String[] args) {
        EntregaMoto entrega1 = new EntregaMoto("Joao",150 ,"R.Manoel Gomes",23);
        EntregaCarro entrega2 = new EntregaCarro("Grimaldo",180,"R.Dos Sem Tetos",30);
        EntregaPontoRetirada retirada = new EntregaPontoRetirada("Motoboy",0,10);

        Pedido entregaMotoca = new Pedido(entrega1);
        System.out.println(entregaMotoca.precoEntrega());

        Pedido entregaMcQueen = new Pedido(entrega2);
        System.out.println(entregaMcQueen.precoEntrega());

        Pedido entregaPreguica = new Pedido(retirada);
        System.out.println(entregaPreguica.precoEntrega());
    }
}
