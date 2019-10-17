package OpenClosedDIP;

public class Compra {

	private String cidade;
	private double valor;
	
	
	public Compra(String cidade, double valor) {
		this.cidade = cidade;
		this.valor = valor;
	}


	public double getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	public String getCidade() {
		return cidade;
	}
}
