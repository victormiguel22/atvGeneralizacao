package ex1;

public class PessoaFisica extends Pessoa {
	
	private String cpf, estadoCivil;

	
	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getEstadoCivil() {
		return estadoCivil;
	}



	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}



	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", estadoCivil=" + estadoCivil + " Nome()=" + getNome()
				+ ", Endereco()=" + getEndereco() + "]";
	}

	
	
}
