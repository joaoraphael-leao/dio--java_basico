package src.IphoneUml.Musica;

public class Musica {
    private String nomeMusica;
    private float tempoDuracao;
    private float tempoAtual;
    private Musica proximaMusica;

    // Construtor público
    public Musica(String nomeMusica, float tempoDuracao) {
        this.nomeMusica = nomeMusica;
        this.tempoDuracao = tempoDuracao;
        this.tempoAtual = 0;
        this.proximaMusica = null;
    }

    // Getters e setters
    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public float getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(float tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public float getTempoAtual() {
        return tempoAtual;
    }

    public void setTempoAtual(float tempoAtual) {
        this.tempoAtual = tempoAtual;
    }

    public Musica getProximaMusica() {
        return proximaMusica;
    }
    public void setProximaMusica(Musica proximaMusica) {
        this.proximaMusica = proximaMusica;
    }
}