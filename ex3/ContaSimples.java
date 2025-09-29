package ex3;

public class ContaSimples extends Conta { 

	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca (double  valor) {
		if (valor > 0) {
			saldoPoupanca += valor;
		return true;
		} else
			System.out.println("Valor inválido");
			return false;
		}
	
	public boolean saquePoupanca (double  valor) {
		if (valor > 0 && valor <= saldoPoupanca) {
			saldoPoupanca -= valor;
			return true;
			} else
				System.out.println("Valor inválido ou saldo insuficiente");
				return false;
	}

	@Override
	public String toString() {
		return "ContaSimples [saldoPoupanca=" + saldoPoupanca + ", Agencia()=" + getAgencia() + ", NumeroConta()="
				+ getNumeroConta() + ", Banco()=" + getBanco() + ", Saldo()=" + getSaldo() + "]";
	}
	
	
	
}
