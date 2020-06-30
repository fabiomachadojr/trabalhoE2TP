package dominio;

// CLASSE DE DOMINIO
public class Conta {

	private int numeroConta;
	private String nomeCorrestista;
	private float saldo;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNomeCorrestista() {
		return nomeCorrestista;
	}
	public void setNomeCorrestista(String nomeCorrestista) {
		this.nomeCorrestista = nomeCorrestista;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
}
