package strategy.investimento;

public class RealizadorDeInvestimento {
	
	public double realizaInvestimento(double valor, Investimento investimento) {
		return investimento.investir(valor) * 0.75;
	}
}
