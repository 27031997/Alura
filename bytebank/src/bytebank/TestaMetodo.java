package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDaAnna = new Conta();
		contaDaAnna.saldo = 100;
		contaDaAnna.deposita(50);
		System.out.println(contaDaAnna.saldo);
		
		boolean conseguiuRetirar = contaDaAnna.saca(20);
		System.out.println(contaDaAnna.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = 
				contaDaMarcela.transfere(300, contaDaAnna);
		if(sucessoTransferencia) {
			System.out.println("Transferência feita com sucesso");
		}else {
			System.out.println("Fatou grana!");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaAnna.saldo);
	}

}
