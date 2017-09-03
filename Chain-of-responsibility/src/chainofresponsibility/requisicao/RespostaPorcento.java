package chainofresponsibility.requisicao;

public class RespostaPorcento implements Resposta {

	@Override
	public void imprimeConta(Requisicao requisicao, Conta conta) {
		if (Formato.PORCENTO.equals(requisicao.getFormato())) {
			System.out.println(conta.getNomeTitular() + "%" + conta.getSaldo());
		}
	}

	public void setProximaResposta(Resposta resposta) {
	}

}
