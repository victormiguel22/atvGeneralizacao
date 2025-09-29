package ex4;

public class Main {

	public static void main(String[] args) {

		Carro c = new Carro();
		Caminhao cm = new Caminhao();
		Moto m = new Moto();
		
		c.setMotor(true);
		c.setPortas(4);
		
		cm.setEixos(16);
		cm.setMotor(true);
		
		m.setCilindradas(220);
		m.setMotor(true);
		
		System.out.println(c);
		System.out.println(cm);
		System.out.println(m);
		
	}

}
