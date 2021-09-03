
public abstract class Funcionario { // N�o podemos instanciar est� classe pois � abstrata!
									// ABSTACT = N�o possuem corpo (implementa��o), apenas definem a assinatura.

	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
		
	};// JAVA cria automaticamente, portanto n�o � necessario quando se tem apenas um construtor.
	
	public abstract double getBonificacao(); // nn h� implementacao deste metodo aqui mas sim nas classes filhas
	
	public String getNome() {
		return nome;
	};
	public void setNome(String nome) {
		this.nome = nome;	
	}
	
	public String getcpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario(){
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
		
	}
	
	
}
