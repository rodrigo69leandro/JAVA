
public class ContaPoupanca extends Conta {

	
	
	public ContaPoupanca(int agencia,int numero,double saldo) {
		super(agencia, numero, saldo); // caso n�o utilize o SUPER, precisamos reescrever os contrutores, o que nn � inteligente.
		
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; // quando temos um extends de uma classe com algo abstrato, somos obrigados a implementar nas demais
		
	}
}

