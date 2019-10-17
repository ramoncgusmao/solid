package OpenClosedDIP;

public class CalculadoraDePrecos {

	
	 private TabelaDePreco tabela;
	private ServiceDeEntrega servico;

	public CalculadoraDePrecos(TabelaDePreco tabela, ServiceDeEntrega servico) {
		this.tabela = tabela;
		this.servico = servico;
		
		// TODO Auto-generated constructor stub
	}
	public double calcula(Compra produto) {
	
	        double desconto = tabela.descontoPara(produto.getValor());
	        double frete = servico.para(produto.getCidade());

	        return produto.getValor() * (1 - desconto) + frete;
	    }
}
