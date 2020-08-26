
public class TestFuncionario {

	public static void main(String[] args) {
		
		Gerente anna = new Gerente();
		anna.setNome("Anna Caroline");
		anna.setCpf("222333666-55");
		anna.setSalario(2600.00);
		
		System.out.println(anna.getNome());
		System.out.println(anna.getBonificacao());
		
		anna.setSalario(300.0);
		
	}

}
