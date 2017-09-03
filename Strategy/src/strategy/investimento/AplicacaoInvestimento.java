package strategy.investimento;

public class AplicacaoInvestimento {

	public static void main(String[] args) {

		RealizadorDeInvestimento realizadorDeInvestimento = new RealizadorDeInvestimento();
		
		System.out.println(realizadorDeInvestimento.realizaInvestimento(100, new InvestimentoConservador()));
	}
}
