package chainofresponsibility.desconto;

public class DescontoPorVendaCasada implements Desconto{

	private Desconto proximoDesconto;
	
	public double aplicaDesconto(Orcamento orcamento) {
		if(orcamento.existe("CANETA") && orcamento.existe("LÁPIS")) {
			return orcamento.getValor() * 0.05;
		}
		return proximoDesconto.aplicaDesconto(orcamento); 
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
	}

}
