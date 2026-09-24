import Questao5.*;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        SistemaMonitoramento s1  = new SistemaMonitoramento();

        Alerta alerta = new Alerta("Chefe", "O pagamento caiu");

        Notificador notificacao1 = new Email();
        Notificador notificacao2 = new SMS();
        Notificador notificacao3 = new ZapZap();

        s1.criarNotificador(notificacao1);
        s1.criarNotificador(notificacao2);
        s1.criarNotificador(notificacao3);

        s1.mandarNotificacao(alerta);

        SistemaMonitoramento s2 = new SistemaMonitoramento();

        Alerta alerta2 = new Alerta("Aviso","Pedido negado!");
        s2.criarNotificador(notificacao1);
        s2.criarNotificador(notificacao2);
        s2.criarNotificador(notificacao3);

        s2.mandarNotificacao(alerta2);
        }
    }
