package liskov;

public class ManipuladorDeSaldo {

	private double saldo;

	public ManipuladorDeSaldo() {
	saldo = 0;
	}

	public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saca(double valor) {
    	 if (valor <= this.saldo)  {
             this.saldo -= valor;
         } else {
             throw new IllegalArgumentException();
         }
    }
    
    public void rende(double d)      {
        this.saldo*= d;
    }    
	
}

