package ex3;
import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta c = new Conta();
		ContaSimples cs = new ContaSimples();
		ContaEspecial ce = new ContaEspecial();
		
		c.setSaldo(500);
		c.setBanco("Bradesco");
		c.setAgencia(1);
		c.setNumeroConta(1123);
		
		cs.setSaldo(500);
		cs.setBanco("Itaú");
		cs.setAgencia(2);
		cs.setNumeroConta(2234);
		cs.setSaldoPoupanca(1000);
		
		ce.setSaldo(500);
		ce.setBanco("Bradesco");
		ce.setAgencia(1);
		ce.setNumeroConta(1123);
		ce.setDiasSemJuros(5);
		ce.setLimite(1500);
		
		System.out.println("Faça um depósito");
		System.out.println("Saldo atual: R$"+ c.getSaldo());
		c.deposito(sc.nextDouble());
		System.out.println("Saldo atual: R$" + c.getSaldo());
		
		System.out.println("Faça um saque");
		c.saque(sc.nextDouble());
		System.out.println("Saldo atual: R$" + c.getSaldo());
		
		System.out.println(c);
		
		System.out.println("Faça um depósito");
		System.out.println("Saldo atual: R$"+ cs.getSaldo());
		cs.deposito(sc.nextDouble());
		System.out.println("Saldo atual: R$" + cs.getSaldo());
		
		System.out.println("Faça um saque");
		cs.saque(sc.nextDouble());
		System.out.println("Saldo atual: R$" + cs.getSaldo());
		
		System.out.println("Faça um depósito na poupança");
		System.out.println("Saldo atual: R$"+ cs.getSaldoPoupanca());
		cs.depositoPoupanca(sc.nextDouble());
		System.out.println("Saldo atual: R$" + cs.getSaldoPoupanca());
		
		System.out.println("Faça um saque da poupança");
		cs.saquePoupanca(sc.nextDouble());
		System.out.println("Saldo atual: R$" + cs.getSaldoPoupanca());
		
		System.out.println(cs);
		
		System.out.println("Faça um depósito");
		System.out.println("Saldo atual: R$"+ ce.getSaldo());
		ce.deposito(sc.nextDouble());
		System.out.println("Saldo atual: R$" + ce.getSaldo());
		
		System.out.println("Faça um saque");
		ce.saque(sc.nextDouble());
		System.out.println("Saldo atual: R$" + ce.getSaldo());
		
		System.out.println(ce);
	}

}
