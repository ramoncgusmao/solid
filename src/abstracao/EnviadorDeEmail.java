package abstracao;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
	System.out.println("Enviando email");
	}
	
	
}
