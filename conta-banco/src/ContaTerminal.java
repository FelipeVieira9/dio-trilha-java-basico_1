import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero, agencia;
        double saldo = 1000.20;
        String nomeCliente;

        System.out.println("Bem vindo ao banco, favor digitar a agencia: ");
        agencia = scanner.nextInt();

        System.out.println("Numero do banco: ");
        numero = scanner.nextInt();

        System.out.println("Nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
