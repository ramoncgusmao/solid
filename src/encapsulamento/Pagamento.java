package encapsulamento;

public class Pagamento {

	private double valor;

	private MeioDePagamento boleto;

	public Pagamento(double valorMensal, MeioDePagamento boleto) {
		
		valor = valorMensal;
		// TODO Auto-generated constructor stub
		this.setForma(boleto);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public MeioDePagamento getForma() {
		return boleto;
	}

	public void setForma(MeioDePagamento boleto) {
		this.boleto = boleto;
	}
	
	
}
