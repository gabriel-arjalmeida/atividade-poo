package Questao5;

import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoramento {
    private List<Notificador> notificadores = new ArrayList<>();

    public SistemaMonitoramento() {
    }
    public void alertar(Notificador notificador) {
        this.notificadores.add(notificador);
    }
    public void mandarNotificacao() {
        for (Notificador notificador : notificadores) {
            notificador.enivarMensagem();
        }
    }
}
