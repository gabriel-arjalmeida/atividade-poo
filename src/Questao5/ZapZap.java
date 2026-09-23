package Questao5;

public class ZapZap implements Notificador{
    private Alerta alerta;

    public ZapZap(Alerta alerta) {
        this.alerta = alerta;
    }

    @Override
    public void enivarMensagem() {
        System.out.println("ZapZap :"+alerta);
    }
}
