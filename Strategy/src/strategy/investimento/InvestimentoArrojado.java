package strategy.investimento;

import java.util.Random;

public class InvestimentoArrojado implements Investimento{

	public double investir(double valor) {
		double chance = new Random().nextDouble();
		
		if(chance < 0.2) {
			return valor * 0.02;
		} else if (chance >= 0.5) {
			return valor * 0.006;
		} 
		return chance * 0.03;
	}

}
