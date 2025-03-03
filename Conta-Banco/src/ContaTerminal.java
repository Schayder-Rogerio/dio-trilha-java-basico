import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal
{
    private static int numeroCartao;
    private static String agencia;
    private static String nomeCliente;
    private static double saldo;
    public static void main(String[] args) throws Exception{

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){

            System.out.println("Por favor, digite o número do cartão !");
            numeroCartao = scanner.nextInt();
            System.out.println("Por favor, digite o número da Agência !");
            agencia = scanner.next();
            System.out.println("Por favor, digite o seu nome !");
            nomeCliente = scanner.next();
            System.out.println("Por favor, digite o seu saldo !");
            saldo = scanner.nextDouble();

            System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque",nomeCliente,agencia,numeroCartao,saldo));

        }
    }

}

