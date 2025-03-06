import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //variaveis
        int numero = 1021;
        double saldo = 300.50;
        
        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da Agência");
        String agencia = scanner.next();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque!");

    }
}
