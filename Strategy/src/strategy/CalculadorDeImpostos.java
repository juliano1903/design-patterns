package strategy;

public class CalculadorDeImpostos {
	
	public double calculaImposto (Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
	}
}
