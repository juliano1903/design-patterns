package chainofresponsibility.requisicao;

public class ProcessadorDeResposta {

	public void processaResposta(Requisicao requisicao, Conta conta) {
		
		Resposta respostaXML = new RespostaXML();
		Resposta respostaCSV = new RespostaCSV();
		Resposta respostaPorcento = new RespostaPorcento();
		
		respostaXML.setProximaResposta(respostaCSV);
		respostaCSV.setProximaResposta(respostaPorcento);
		
		respostaXML.imprimeConta(requisicao, conta);
	}
}
