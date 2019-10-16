package SingleResponsability;

public class Funcionario {

	private double salarioBase;
	private Cargo cargo;
	
	public double getSalarioBase() {
		// TODO Auto-generated method stub
		return salarioBase;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calculaSalario() {
		return cargo.getRegra().calcula(this);
	}

	
}
