package br.com.bytebank.banco.modelo;
public class SeguroDeVida implements Tributavel {

	public SeguroDeVida() {
		
	}

	@Override
	public double getValorImposto() {
		return 42;
	}
	
}
