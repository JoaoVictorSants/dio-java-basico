import java.util.Scanner;

/*<h1>Conta Terminal</h1>
* O usuário irá fornecer as informações solicitadas via terminal, utilizando a classe Scanner.
* Após todas as informações serem inseridas, o sistema irá exibir uma mensagem com as informações preenchidas.
* <p>
* Este programa simula a criação de uma conta bancária a partir das entradas fornecidas pelo usuário.
* </p> 
*
*
 * @autor: João Victor Santos
 * @since: 24/05/2024
*/

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
   

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
    
        System.out.print("Digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
                                         
        scanner.close();

    }
}
