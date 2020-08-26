
public class TestaBanco {

	public static void main(String[] args) {

		Cliente anna = new Cliente();
		anna.nome = "Anna Inácio";
		anna.cpf  = "333.333.333-33";
		anna.profissao = "Vasp";
		
		Conta contaDaAnna = new Conta();
		contaDaAnna.deposita(100);
		
		
		contaDaAnna.titular = anna;
		System.out.println(contaDaAnna.titular.nome);
	}

}
