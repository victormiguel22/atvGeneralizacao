package ex1;

public class PessoaJuridica extends Pessoa {
	
	private String cpnj, tipoEmpresa;

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cpnj=" + cpnj + ", tipoEmpresa=" + tipoEmpresa + ", Nome()=" + getNome()
				+ ", Endereco()=" + getEndereco() + "]";
	}

}
