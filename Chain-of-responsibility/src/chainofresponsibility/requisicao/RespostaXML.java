package chainofresponsibility.requisicao;

public class RespostaXML implements Resposta {

	private Resposta proximaResposta;

	public void imprimeConta(Requisicao requisicao, Conta conta) {
		if(Formato.XML.equals(requisicao.getFormato())) {
			System.out.println("<titular-conta>"+conta.getNomeTitular()+"</titular-conta><saldo>"+conta.getSaldo()+"</saldo>");
		} else {
			proximaResposta.imprimeConta(requisicao, conta);
		}			
	}

	public void setProximaResposta(Resposta resposta) {
		this.proximaResposta = resposta;
	}

}
