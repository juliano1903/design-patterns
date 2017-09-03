package chainofresponsibility.requisicao;

public class Conta {

	private double saldo;
	private String nomeTitular;

	public Conta(double saldo, String nomeTitular) {
		this.saldo = saldo;
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

}
