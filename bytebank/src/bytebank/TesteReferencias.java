package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Segunda conta: " + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("MESMA conta refer�ncia");
		}else {
			System.out.println("Conta refer�ncia, DIFERENTE");
		}
	
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}

}
