package conta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        
        //Limpando o buffer que resta após o uso de nextInt
        scanner.nextLine(); 


        // Solicita e lê a agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.print("Por favor, digite o saldo (obs: o padrão deve ser com vírgula, por exemplo: 250,55): ");
        double saldo = scanner.nextDouble();


        // mensagem com dados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
   }