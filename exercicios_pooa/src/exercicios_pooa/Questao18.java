package exercicios_pooa;

import java.util.Scanner;

public class Questao18 
{

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite um numero com 4 caracteres: ");// solicitação
		int n = sc.nextInt(); // armazenagem
		
		int resto, invert = 0; // declaração de resto e inverter iniciando em zero
		
		while( n > 0 ) // quando o numero for maior que zero
		{
	         resto = n % 10; // resto da divisão do numero por 10
	         invert = invert * 10 + resto;
	         n /= 10;
	      }
	 
	      System.out.println( invert );
		
		sc.close();

	}

}
