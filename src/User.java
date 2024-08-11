import java.util.Scanner;
import java.util.Locale;
public class User {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaBanco cliente1 = new ContaBanco();

        System.out.println("Por favor, digite o número da sua conta: ");
        cliente1.setNumero(scanner.nextInt());
        System.out.println("Por favor, digite sua agência: ");
        cliente1.setAgencia(scanner.next());        
        System.out.println("Por favor, digite seu nome: ");
        cliente1.setNomeCliente(scanner.next());
        System.out.println("Digite seu saldo: ");
        cliente1.setSaldo(scanner.nextDouble());

        System.out.println(cliente1.toString());

        scanner.close();
    }
}
