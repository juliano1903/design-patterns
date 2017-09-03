package chainofresponsibility.requisicao;

public class RespostaCSV implements Resposta{

	private Resposta proximaResposta;
	
	public void imprimeConta(Requisicao requisicao, Conta conta) {
		if(Formato.CSV.equals(requisicao.getFormato())) {
			System.out.println(conta.getNomeTitular()+";"+conta.getSaldo());
		} else {
			proximaResposta.imprimeConta(requisicao, conta);
		}
	}

	public void setProximaResposta(Resposta resposta) {
		this.proximaResposta = resposta;
	}

}
