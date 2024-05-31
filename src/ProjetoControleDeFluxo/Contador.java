package src.ProjetoControleDeFluxo;
import java.util.Scanner;
public class Contador {

    public static void main(String []args){
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        short comecoDoLoop = (short) terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        short finalDoLoop = (short) terminal.nextInt();

        try{
            contar(comecoDoLoop, finalDoLoop);
        }
        catch(ParametrosInvalidosException excecao){
            excecao.printStackTrace();
        }
    }
    static void contar(short comecoDoLoop, short finalDoLoop) throws ParametrosInvalidosException{
        if(comecoDoLoop >= finalDoLoop){
            throw new ParametrosInvalidosException("O segundo numero deve ser maior que o primeiro!!");
        }
        short contagem =(short) (finalDoLoop - comecoDoLoop);

        for(int i = 1; i < contagem + 1; i++){
            System.out.printf("%d ", i);
        }
    }
}
