package src.IphoneUml;

public class Telefone extends iphone{
    private String numeroADiscar;
    private boolean estaEmLigacao = false;
    public void ligar(){
        System.out.printf("Ligando para %s", numeroADiscar);
        estaEmLigacao = true;
    }
    public void discarNumero(String novoNumero){ //igual a um setNumero
        this.numeroADiscar = novoNumero;
    }
    public void atenderLigacao(){
        System.out.println("Agora voce esta em ligacao");
    }
    public void colocarEmEspera(){
        System.out.println("Para voltar a ligacao, clique em \"voltar para ligacao\"");
    }
    public void voltarALigacao(){
        System.out.printf("Voce voltou a ligacao com %s", numeroADiscar);
    }
    public void desligar(){
        System.out.println("Voce desligou");
        estaEmLigacao = false;
    }

}
