package src.SmartTv;

public class SmartTv {
    boolean estaLigada = false;
    byte volume = 2;
    int canal =30;


    public void ligarTv(){
        estaLigada = true;
    }
    public void desligarTv(){
        estaLigada = false;
    }
    public void aumentarVolume(){
        System.out.println("Aumentando o volume para: "+ ++volume);
    }
    public void diminuirVolume(){
        System.out.println("Diminuindo o volume para: "+ --volume);
    }
    public void mudaDeCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando o canal para: "+ canal);
    }
    public void aumentarCanal(){
        System.out.println("Mudando o canal para: "+ ++canal);
    }
    public void diminuirCanal(){
        System.out.println("Mudando o canal para: "+ --canal);
    }
}
