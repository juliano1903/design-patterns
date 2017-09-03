package strategy.investimento;

import java.util.Random;

public class InvestimentoModerado implements Investimento{

	public double investir(double valor) {
		boolean escolhido = new Random().nextDouble() > 0.50;
		
		if(escolhido) {
			return valor * 0.025; 
		}
		return valor * 0.007;
	}

}
