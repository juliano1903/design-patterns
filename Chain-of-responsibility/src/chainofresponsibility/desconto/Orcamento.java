package chainofresponsibility.desconto;

import java.util.ArrayList;

public class Orcamento {

	private ArrayList<Item> itens;
	private double valor;
	
	

	public Orcamento() {
		this.itens = new ArrayList<>();
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void adicionaItem(Item item) {
		valor = valor + item.getValor();
		itens.add(item);
	}
}
