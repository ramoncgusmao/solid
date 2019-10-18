package liskov;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeInvestimento {

	 public static void main(String[] args) {

		 	List<ContaComum> contas = new ArrayList<>();
	        for (ContaComum conta : contas) {
	            conta.rende();

	            System.out.println("Novo Saldo:");
	            System.out.println(conta.getSaldo());
	        }
	    }
}
