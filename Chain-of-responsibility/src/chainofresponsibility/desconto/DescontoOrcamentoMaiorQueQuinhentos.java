package chainofresponsibility.desconto;

public class DescontoOrcamentoMaiorQueQuinhentos implements Desconto{

	private Desconto proximoDesconto;

	public void setProximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

	@Override
	public double aplicaDesconto(Orcamento orcamento) {
		if(orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}
		return proximoDesconto.aplicaDesconto(orcamento);
	}
}
