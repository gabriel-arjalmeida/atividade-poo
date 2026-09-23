import Questao5.*;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        SistemaMonitoramento sistemaMonitoramento = new SistemaMonitoramento();

        Alerta alerta = new Alerta("Chefe", "O pagamento caiu");

        Notificador notificacao1 = new Email(alerta);
        Notificador notificacao2 = new SMS(alerta);
        Notificador notificacao3 = new ZapZap(alerta);

        sistemaMonitoramento.alertar(notificacao1);
        sistemaMonitoramento.alertar(notificacao2);
        sistemaMonitoramento.alertar(notificacao3);

        sistemaMonitoramento.mandarNotificacao();
        }
    }
