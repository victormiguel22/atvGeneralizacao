package ex4;

public class Caminhao extends Veiculo {
	
	private int eixos;

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	@Override
	public String toString() {
		return "Caminhao [eixos=" + eixos + ", Motor=" + isMotor() + "]";
	}
	
	

}
