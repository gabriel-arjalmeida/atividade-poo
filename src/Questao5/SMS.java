package Questao5;

public class SMS implements Notificador{
    public SMS(Alerta alerta) {
        this.alerta = alerta;
    }

    private Alerta alerta;
    @Override
    public void enivarMensagem() {

        System.out.println("SMS :"+alerta);
    }
}
