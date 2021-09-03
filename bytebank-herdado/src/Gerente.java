

public class Gerente extends Autenticavel  {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autenticacao(int senha){
		if(this.senha == senha) {
			return true;
		}
		else
			return false;
	};
	
	
////	public double getBonificacao() {
////		return super.getBonificacao() + super.getSalario; // super, indica que o salario est� definido na classe m�e
////	} -- Para que funcione assim, � necessario utilizar o PROTECTED em SALARIO na classe funcionario mas n�o � uma boa maneira de realizar
//	pois podemos utilizar os metodos para acessar o salario e assim ter mais seguran�a.
	
	public double getBonificacao() {
		return super.getSalario(); // super, indica que o salario est� definido na classe m�e
	}
	
}