package liskov;

public class ContaComum {

	   protected ManipuladorDeSaldo saldo;

	    public ContaComum() {
	        this.saldo = new ManipuladorDeSaldo();
	    }

	    public void deposita(double valor) {
	        saldo.deposita(valor);;
	    }

	    public double getSaldo() {
	        return saldo.getSaldo();
	    }

	    public void saca(double valor) {
	    	saldo.saca(valor);
	    }
	    public void rende()      {
	        this.saldo.rende(1.1);
	    }    
	    

}
