//acessivel para algumas pessoas
public class SistemaInterno {

	private int senha = 123;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autenticacao(this.senha);
		
		if(autenticou) {
			System.out.println("Permiss�o concedida");
					
		}
		else {
			
			System.out.println("Permiss�o negada!!");
		}
		
				
	}
	
	
}
