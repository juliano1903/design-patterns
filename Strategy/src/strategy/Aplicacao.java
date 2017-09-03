package strategy;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		Orcamento orcamento = new Orcamento(10);
		Imposto iss = new ISS();
		
		calculador.calculaImposto(orcamento, iss);
		
		System.out.println(calculador.calculaImposto(orcamento, iss));
	}
}
