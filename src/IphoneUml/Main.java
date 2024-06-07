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
            nav.setSiteAnterior("www.google.com");
            System.out.println("Site atual: " + nav.getSiteAtual());
            System.out.println("Site anterior: " + nav.getSiteAnterior());
            nav.voltarSite();
            System.out.println("Site atual: " + nav.getSiteAtual());
            System.out.println("Proximo site: " + nav.getProximoSite());
        }

        if (reprodutorMusical instanceof ReprodutorMusical) {
            ReprodutorMusical player = (ReprodutorMusical) reprodutorMusical;
            player.escolherMusica();
            player.tocarMusica();
            player.pararMusica();
            player.passarParaProximaMusica();
        }

        if (telefone instanceof Telefone) {
            Telefone phone = (Telefone) telefone;
            phone.discarNumero("4002-8922");
            phone.ligar();
            phone.colocarEmEspera();
            phone.desligar();
        }
    }
}
