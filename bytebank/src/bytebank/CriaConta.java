package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("segunda conta est� na ag�ncia: " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("MESMA conta refer�ncia");
		}else {
			System.out.println("Conta refer�ncia, DIFERENTE");
		}
	
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
