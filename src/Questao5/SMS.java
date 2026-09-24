package Questao5;

public class SMS implements Notificador{
    public SMS(){

    }

    private Alerta alerta;
    @Override
    public void enivarMensagem(Alerta alerta) {

        System.out.println("SMS :"+alerta);
    }
}
