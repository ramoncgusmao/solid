package abstracao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import encapsulamento.Pagamento;

public class Fatura {

	private double valorMensal;
	private String cliente;
	private boolean pago;
	private List<Pagamento> lista;

	public Fatura() {
	}

	public Fatura(double valorMensal, String cliente) {
		this.valorMensal = valorMensal;
		this.cliente = cliente;
		this.lista = new ArrayList<Pagamento>();
	}

	public double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Pagamento> getPagamentos() {
		// TODO Auto-generated method stub
		return Collections.unmodifiableList(lista);
	}


	public void adicionaPagamento(Pagamento pagamento) {
		lista.add(pagamento);

		double valor = valorPago();
		if(valor >= valorMensal) {
			pago = true;
		}

	}

	private double valorPago() {
		return lista.stream().mapToDouble(p -> p.getValor()).sum();
	}

	public boolean isPago() {
		return pago;
	}


}
