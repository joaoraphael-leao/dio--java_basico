package src.IphoneUml;

import src.IphoneUml.Musica.Musica;

public class ReprodutorMusical extends iphone{
    private Musica musicaAtual;

    public void escolherMusica() {
        this.musicaAtual = new Musica("Wonderwall", 4.17f);
    }

    public void tocarMusica() {
        if (musicaAtual != null) {
            System.out.println("Tocando: " + musicaAtual.getNomeMusica());
        } else {
            System.out.println("Nenhuma música foi escolhida.");
        }
    }

    public void pararMusica() {
        if (musicaAtual != null) {
            System.out.println("Parando: " + musicaAtual.getNomeMusica());
        } else {
            System.out.println("Nenhuma música está tocando.");
        }
    }
    public void passarParaProximaMusica() {
        if (musicaAtual != null && musicaAtual.getProximaMusica() != null) {
            System.out.println("Passando para a próxima música: " + musicaAtual.getNomeMusica());
        } else {
            System.out.println("Nenhuma música na fila.");
        }
    }
}
