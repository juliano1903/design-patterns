package chainofresponsibility.desconto;

import java.util.Arrays;

public class Aplicacao {

	public static void main(String[] args) {
		
		Item item1 = new Item(400, "Lápis");
		Item item2 = new Item(200, "Caneta");
		
		Orcamento orcamento = new Orcamento();
		
		orcamento.adicionaItem(item1);
		orcamento.adicionaItem(item2);
		
		CalculadorDeDesconto calculador = new CalculadorDeDesconto();
		
		System.out.println(calculador.calculaDesconto(orcamento));
	}
}
