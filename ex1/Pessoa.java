package ex1;

public class Pessoa {
	
	private String nome, endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + "]";
	}

}
