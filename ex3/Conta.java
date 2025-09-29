package ex3;

public class Conta {

	private int agencia, numeroConta;
	private String banco;
	private double saldo;
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean deposito (double  valor) {
		if (valor > 0) {
			saldo += valor;
		return true;
		} else
			System.out.println("Valor inválido");
			return false;
		}
	
	public boolean saque (double  valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			return true;
			} else
				System.out.println("Valor inválido ou saldo insuficiente");
				return false;
	}
	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numeroConta=" + numeroConta + ", banco=" + banco + ", saldo=" + saldo
				+ "]";
	}
	
	
	
	
}
