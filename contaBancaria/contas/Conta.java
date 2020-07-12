package contas;

public class Conta{
	
	private int numeroConta;
	private String nomeCliente;
	private float saldo;

	public Conta(int numeroConta, String nomeCliente) {
		this.setNumeroConta(numeroConta);
		this.setNomeCliente(nomeCliente);
	}
	
	
	public void sacar(float valor){
		if (this.saldo>valor){
			this.setSaldo(this.getSaldo()-valor);
			System.out.println("Saque de "+valor+" reais realizado!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositar(float valor){
		this.setSaldo(this.getSaldo()+valor);
		System.out.println("Depósito de "+valor+" reais realizado!");
	}
	
	public boolean transferePara(Conta contaDestino, float valor) {
		if(valor<saldo){
			this.setSaldo(this.getSaldo()-valor);
			return true;
		} else {
			return false;
		}
	}
	
	
	//getters e setters da conta
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String getNumeroConta() {
		return Integer.toString(numeroConta);
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public Float getSaldo() {
		return this.saldo;
	}
	
}