import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o número da agência:");
        String agency = scanner.nextLine();

        System.out.println("Insira o número da conta:");
        int number = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Insira o seu nome:");
        String name = scanner.nextLine();

        System.out.println("Insira o saldo da sua conta:");
        double ammount = scanner.nextDouble();

        System.out.printf("""
                            Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d
                            e seu saldo %s já está disponível para saque\n""", name, agency, number, ammount);
        
        scanner.close();
    }
}
