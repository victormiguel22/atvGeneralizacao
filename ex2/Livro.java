package ex2;

public class Livro extends Item {
	
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", Codigo()=" + getCodigo() + ", Descricao()=" + getDescricao() + "]";
	}

	
	
}
