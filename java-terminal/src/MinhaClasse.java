import  java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Ola, pessoal! Fui executado pelo terminal");
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Seu nome é: " + nome);
    }
}
