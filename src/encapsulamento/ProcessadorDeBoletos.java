package encapsulamento;

import java.util.List;

import abstracao.Fatura;

public class ProcessadorDeBoletos {

	  public void processa(List<Boleto> boletos, Fatura fatura) {
	
	        for(Boleto boleto : boletos) {
	            Pagamento pagamento = new Pagamento(boleto.getValorMensal(),   
	        MeioDePagamento.BOLETO);
	            fatura.adicionaPagamento(pagamento);
       
	        }


	    }
}
