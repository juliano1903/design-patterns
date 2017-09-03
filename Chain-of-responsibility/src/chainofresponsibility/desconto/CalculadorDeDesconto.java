package chainofresponsibility.desconto;

public class CalculadorDeDesconto {
	
	public double calculaDesconto(Orcamento orcamento) {
		
		Desconto descontoMaisDeCincoItens = new DescontoMaisDeCincoItens();
		Desconto descontoMaiorQueQuinhentos = new DescontoOrcamentoMaiorQueQuinhentos();
		Desconto naoAplicaDesconto = new NaoAplicaDesconto();
		
		descontoMaisDeCincoItens.setProximoDesconto(descontoMaiorQueQuinhentos);
		descontoMaiorQueQuinhentos.setProximoDesconto(naoAplicaDesconto);
		
		return descontoMaisDeCincoItens.aplicaDesconto(orcamento);
	}
}
