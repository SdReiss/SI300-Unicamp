package contas;

public class ContaEspecial extends Conta{
	
	float limiteCredito;
	
	public ContaEspecial (int numeroConta, String nomeCliente) {
		super(numeroConta, nomeCliente);
		this.setLimiteCredito(300); //300 é o limite padrão definido por mim
	}
	
	
	//Contas Especiais podem sacar com um limite de crédito
	@Override
	public void sacar(float valor){
		if ((this.getSaldo()+limiteCredito)>valor){
			this.setSaldo(this.getSaldo()-valor);
			System.out.println("Saque de "+valor+" reais realizado!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	
	//getters e setters de limiteCredito
	public void setLimiteCredito(float valor) {
		this.limiteCredito = valor;
	}
	
	public String getLimiteCredito() {
		return Float.toString(limiteCredito);
	}
	
}