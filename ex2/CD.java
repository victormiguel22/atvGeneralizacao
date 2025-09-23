package ex2;

public class CD extends Midia {
	
	private int faixas;
	private String artista, album;
	public int getFaixas() {
		return faixas;
	}
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	@Override
	public String toString() {
		return "CD [faixas=" + faixas + ", artista=" + artista + ", album=" + album + ", Gravadora()="
				+ getGravadora() + ", Duracao()=" + getDuracao() + ", Codigo()=" + getCodigo()
				+ ", Descricao()=" + getDescricao() + "]";
	}
	
	

}
