package strategy.investimento;

public class InvestimentoConservador implements Investimento{

	public double investir(double valor) {
		return valor * 0.008;
	}

}
