package chainofresponsibility.requisicao;

public class AplicacaoResposta {
	
	public static void main(String[] args) {
		
		Requisicao requisicao = new Requisicao(Formato.XML);
		
		ProcessadorDeResposta processadorDeResposta = new ProcessadorDeResposta();
		
		processadorDeResposta.processaResposta(requisicao, new Conta(200.0, "Juliano Lara"));
		
	}
}
