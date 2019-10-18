package liskov;

public class ContaEstudante {

	 private ManipuladorDeSaldo m;
	    private int milhas;

	    public ContaEstudante()  { 
	        m = new ManipuladorDeSaldo();
	    }
	    public void deposita(double valor)  {
	        m.deposita(valor);
	        this.milhas += (int)valor;
	    }
	    public int getMilhas()  {
	        return this.milhas;
	    }
	    
	    public double getSaldo()  {
	        return m.getSaldo();
	    }
}
