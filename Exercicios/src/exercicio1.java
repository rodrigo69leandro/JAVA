import java.util.Scanner;

/*
Fa�a um algoritmo que receba dois n�meros, calcule e mostre a soma, a 
multiplica��o, divis�o, o resto da divis�o (entre os dois n�meros) e a raiz 
quadrada de cada n�mero. 
*/


public class exercicio1 {
	
	public static void main(String[] args) {
		
		float soma;
		float multiplicacao;
		float divisao;
		float resto;
		float raizN1;
		float raizN2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculadora");
		System.out.println(" ");
		
		System.out.println("Entre com o primeiro n�mero: ");
		float numero1 = input.nextFloat();
		
		System.out.println("Entre com o segundo n�mero: ");
		float numero2 = input.nextFloat();
		
		soma = numero1 + numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		resto = numero1 % numero2;
		raizN1 = (float)Math.sqrt(numero1);
		raizN2 = (float)Math.sqrt(numero2);
		
		System.out.println("A soma dos n�meros � de " + soma);
		System.out.println("A multiplica��o dos n�mero � de " + multiplicacao);
		System.out.println("A divis�o dos n�meros � de " + divisao);
		System.out.println("O resto da divis�o entre os n�meros � de " + divisao);
		System.out.println("A raiz quadrada do n�mero " + numero1 + " � " + raizN1);	
		System.out.println("A raiz quadrada do n�mero " + numero2 + " � " + raizN2);
		
	}
	
}
