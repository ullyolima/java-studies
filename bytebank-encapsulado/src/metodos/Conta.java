package metodos;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular = new Cliente();
	
	Conta (int agencia, int numero) {
		this.setAgencia(agencia);
		this.setNumero(numero);
	}
	
	// get and setters
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//métodos
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
		}
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
}
