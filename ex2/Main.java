package ex2;

public class Main {

	public static void main(String[] args) {

		Livro l = new Livro();
		CD c = new CD();
		VHS v = new VHS();
		
		l.setAutor("Lobatinho gameplays");
		l.setCodigo(123);
		l.setDescricao("Boneca que fala");
		
		System.out.println(l);
		
		c.setAlbum("The Marshall Mathers");
		c.setArtista("Em");
		c.setCodigo(1112);
		c.setDescricao("Brabissimo");
		c.setDuracao(20);
		c.setFaixas(5);
		c.setGravadora("Grava y grava");
		
		System.out.println(c);
		
		v.setCodigo(12);
		v.setDescricao("velho");
		v.setDuracao(12);
		v.setGravadora("centauro");
		v.setTitulo("vrum");
		
		System.out.println(v);
	}

}
