package src.ContaBanco;
import java.util.Scanner;

public class contaTerminal{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        String nome = inputNome(scanner);
        String numeroAgencia = inputNumeroAgencia(scanner);
        int numeroConta = inputNumeroConta(scanner);
        float saldo = inputSaldo(scanner);

        System.out.println("Ola " + nome + " obrigado por criar uma conta em nosso banco, " +
                "sua agencia é " + numeroAgencia +
                " conta " + numeroConta +
                " e seu saldo " + saldo + " ja está disponivel");
        scanner.close();




    }
    public static String inputNome(Scanner scanner){
        System.out.println("Digite o seu nome");
        return scanner.nextLine();
    }
    public static String inputNumeroAgencia(Scanner scanner){
        System.out.println("Digite o numero da agencia:");
        return scanner.nextLine();
    }
    public static int inputNumeroConta(Scanner scanner){
        System.out.println("Digite o numero da sua conta:");
        return scanner.nextInt();
    }
    public static float inputSaldo(Scanner scanner){
        System.out.println("Digite o seu saldo:");
        return scanner.nextFloat();
    }
}
