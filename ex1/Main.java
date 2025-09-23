package ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaFisica pf = new PessoaFisica();

		pf.setCpf("166.051.219-34");
		pf.setEndereco("Rua Garibalda");
		pf.setEstadoCivil("Casado");
		pf.setNome("Claudinho matador de policia");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setCpnj("219329193-32");
		pj.setEndereco("Travessa maya");
		pj.setNome("Pedrinho");
		pj.setTipoEmpresa("S/A");
		
		System.out.println(pj);
	}

}
