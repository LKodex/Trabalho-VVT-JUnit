package vvt.trabalho;

public class Conta {
	private int numero;
	private String titular;
	protected double saldo;
	private double limite;
	public int idade;
	public String responsavel;

	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public void deposita(double valor) {
		saldo += valor;
	}


	public static Conta criarContaFilho(int numero, String titular, Conta responsavel, double limite ){
		if (responsavel == null) return null;
		Conta novaConta = new Conta(numero, titular);
		return novaConta;

	}

	public Boolean saca(double valor) {
		if (saldo + limite < valor)
			return false;
		saldo -= valor;
		return true;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}

}
