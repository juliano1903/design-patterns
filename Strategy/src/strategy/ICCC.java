package strategy;

public class ICCC implements Imposto{

	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.5; 
		} else if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.7;
		}
		return orcamento.getValor() * 0.8;
	}
}
