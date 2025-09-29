package ex3;

public class ContaEspecial extends Conta {
	
	private int diasSemJuros;
	private double limite;
	
	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [diasSemJuros=" + diasSemJuros + ", limite=" + limite + ", Agencia()=" + getAgencia()
				+ ", NumeroConta()=" + getNumeroConta() + ", Banco()=" + getBanco() + ", Saldo()=" + getSaldo()
				+ "]";
	}
	
	

}
