package chainofresponsibility.desconto;

public class DescontoMaisDeCincoItens implements Desconto{

	private Desconto proximodesconto;
	
	@Override
	public double aplicaDesconto(Orcamento orcamnento) {
		if (orcamnento.getItens().size() > 5) {
			return orcamnento.getValor() * 0.1;
		} else {
			return proximodesconto.aplicaDesconto(orcamnento);
		}
	}

	public void setProximoDesconto(Desconto proximodesconto) {
		this.proximodesconto = proximodesconto;
	}
}
