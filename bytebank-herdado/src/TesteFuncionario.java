
public class TesteFuncionario {

	
	public static void main(String[] args) {
		
		Funcionario rodrigo = new Funcionario();
		
		rodrigo.setNome("Rodrigo Leandro");
		rodrigo.setCpf("12345678909");
		rodrigo.setSalario(15000);
		
		System.out.println("Salario do " + rodrigo.getNome() + " � de " + rodrigo.getSalario());
		System.out.println("A bonifica��o � de " + rodrigo.getBonificacao());
	}
}
