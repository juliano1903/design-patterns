package chainofresponsibility.desconto;

public interface Desconto {

	double aplicaDesconto(Orcamento orcamento);
	
	void setProximoDesconto(Desconto desconto);
}
