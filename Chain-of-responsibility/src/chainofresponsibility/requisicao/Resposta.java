package chainofresponsibility.requisicao;

public interface Resposta {

	void imprimeConta(Requisicao requisicao, Conta conta);
	
	void setProximaResposta(Resposta resposta);
}
