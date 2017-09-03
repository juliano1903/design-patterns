package chainofresponsibility.desconto;

public class NaoAplicaDesconto implements Desconto{

	@Override
	public double aplicaDesconto(Orcamento orcamento) {
		return orcamento.getValor();
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
	}
	
}
