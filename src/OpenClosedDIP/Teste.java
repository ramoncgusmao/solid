package OpenClosedDIP;

public class Teste {

public static void main(String[] args) {
	Compra produto = new Compra("SAO PAULO", 200);
	CalculadoraDePrecos calc = new CalculadoraDePrecos(new TabelaDePrecoPadrao(), new Frete());
	System.out.println(calc.calcula(produto));
}
}
