import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: " );
        String nome = scanner.nextLine();
        System.out.print("Digite numero da sua agência: ");
        String agencia = scanner.next();
        System.out.print("Digite o número da conta: " );
        int numero = scanner.nextInt();
        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo "+ saldo + " já está disponível para saque");

    }
}
