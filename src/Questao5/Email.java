package Questao5;

public class Email implements Notificador{
    private Alerta alerta;

    public Email(Alerta alerta) {
        this.alerta = alerta;
    }

    @Override
    public void enivarMensagem() {
        System.out.println("Email :"+alerta);
    }
}
