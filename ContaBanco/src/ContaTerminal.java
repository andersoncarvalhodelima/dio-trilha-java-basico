import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta e tecle [ENTER]");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência e tecla [ENTER]");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo e tecla [ENTER]");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo disponível e tecla [ENTER]");
        double saldo = scanner.nextDouble();

        scanner.close();
        String mensagemFinal = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %2.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);
        System.out.println(mensagemFinal);
    }
}
