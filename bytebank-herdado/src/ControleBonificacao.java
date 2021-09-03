
public class ControleBonificacao {

	
	private double soma;
	
	public void registra(Funcionario f) { // Utilizando a referencia generica - polimorfismo +- inventar um codigo generico e utilizar em qualquer lugar
										  // Refer�ncias de tipos de classes mais gen�ricas referenciam objetos mais espec�ficos.
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
		
	}
	
	public double getSoma() {
		return soma;
	}
	
}
