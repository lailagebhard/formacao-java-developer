package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String primeiroNomeCliente;
		String sobrenomeCliente;
		int conta;
		String agencia;
		double saldo;
		
		System.out.println("Por favor, digite o seu nome:");
		primeiroNomeCliente = scan.next() + " ";
		
		System.out.println("E seu sobrenome:");
		sobrenomeCliente = scan.next();
		
		System.out.println("Agora, digite o número da Conta:");
		conta = scan.nextInt();
		
		System.out.println("Digite o número da Agência:");
		agencia = scan.next();
		
		System.out.println("Digite o seu saldo:");
		saldo = scan.nextDouble();
		
		
		System.out.println("Olá " + primeiroNomeCliente.concat(sobrenomeCliente) + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
		+ agencia + ", sua conta é " + conta + ", e seu saldo de R$" + saldo + " já está disponível para saque." );
		
	}

}
