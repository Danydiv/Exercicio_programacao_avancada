package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao1 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media; // declara��o de variavel
	
		
		System.out.println("Digite a primeira nota: "); // solicita��o
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;
		
		System.out.printf("M�DIA = %.5f:", media); // sa�da
		
		
		sc.close();

	}

}
