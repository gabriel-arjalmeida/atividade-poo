package Questao5;

public class Email implements Notificador{
    private Alerta alerta;

    public Email() {
    }

    @Override
    public void enivarMensagem(Alerta alerta) {
        System.out.println("Email :"+alerta);
    }
}
