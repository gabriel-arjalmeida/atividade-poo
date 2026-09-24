package Questao5;

public class ZapZap implements Notificador{
    private Alerta alerta;

    public ZapZap() {

    }

    @Override
    public void enivarMensagem(Alerta alerta) {
        System.out.println("ZapZap :"+alerta);
    }
}
