package classes;

public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;
	
		
	
	public Conta(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}


	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getNumero() {
		return numero;
	}


	@Override
	public String toString() {
		return "\nConta número " + numero + "\nNome: " + nome + "\nSaldo: R$ " + saldo;
	}
	
	
	

}
