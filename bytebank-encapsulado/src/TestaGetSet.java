
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		
		System.out.println(conta.getNumero());
		
		Cliente anna = new Cliente();
		//conta.titular = anna;
		
		anna.setNome("Anna Inacio");
		
		conta.setTitular(anna);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		//agora em duas linhas:
		Cliente titularDaConta =  conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(anna);
		System.out.println(conta.getTitular());
	}
}
