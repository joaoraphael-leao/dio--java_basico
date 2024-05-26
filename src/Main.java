package src;

public class Main {
    public static void main(String []args){
        SmartTv minhaTv = new SmartTv();

        System.out.println("A minha tv esta ligada ? " + minhaTv.estaLigada);
        System.out.println("A minha tv esta no volume " + minhaTv.volume);
        System.out.println(minhaTv.canal);

        minhaTv.canal = 50;

        System.out.println(minhaTv.canal);
        minhaTv.ligarTv();
        System.out.println("A minha tv esta ligada ? " + minhaTv.estaLigada);
        minhaTv.desligarTv();

        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.diminuirVolume();

        minhaTv.diminuirCanal();
        minhaTv.diminuirCanal();
        minhaTv.aumentarCanal();
        minhaTv.mudaDeCanal(80);


    }
}
