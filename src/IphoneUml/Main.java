package src.IphoneUml;

public class Main {
    public static void main(String [] args){
        iphone navegador = new Navegador();
        iphone reprodutorMusical = new ReprodutorMusical();
        iphone telefone = new Telefone();

        // Uso de instanceof para verificar o tipo específico de IphoneUmlApp
        if (navegador instanceof Navegador) {
            Navegador nav = (Navegador) navegador;
            nav.irParaSite("www.rapha.com");
            System.out.println("Site atual: " + nav.getSiteAtual());
        }

        if (reprodutorMusical instanceof ReprodutorMusical) {
            ReprodutorMusical player = (ReprodutorMusical) reprodutorMusical;
            player.escolherMusica();
            player.tocarMusica();
        }

        if (telefone instanceof Telefone) {
            Telefone phone = (Telefone) telefone;
            phone.discarNumero("4002-8922");
            phone.ligar();
        }
    }
}
