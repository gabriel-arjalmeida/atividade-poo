    import Questao1.*;

    public class Main {
        public static void main(String[] args) {
            Entrega entrega1 = new EntregaMoto("Joao",150 ,"R.Manoel Gomes",23);
            Entrega entrega2 = new EntregaCarro("Grimaldo",180,"R.Dos Sem Tetos",30);
            Entrega retirada = new EntregaPontoRetirada("Evandro",0,10);

            Pedido entregaMotoca = new Pedido(entrega1);
            System.out.println(entregaMotoca.precoEntrega());

            Pedido entregaMcQueen = new Pedido(entrega2);
            System.out.println(entregaMcQueen.precoEntrega());

            Pedido entregaPreguica = new Pedido(retirada);
            System.out.println(entregaPreguica.precoEntrega());
        }
    }
