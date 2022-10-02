package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao31 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Digite a primeira nota: ");
	     double nota1 = sc.nextDouble();
	        
	     System.out.println("Digite a primeira nota: ");
	     double nota2 = sc.nextDouble();

	        if ((nota1 < 0 || nota1 > 10)) 
	        {
	            do 
	            {
	                System.out.println("NOTA INVÁLIDA!");
	                System.out.println();
	                System.out.println("DIGITE UMA NOTA VÁLIDA: ");
	                nota1 = sc.nextDouble();
	            }
	            while (nota1 < 0 || nota1 > 10);
	        }
		
	        if ((nota2 < 0 || nota2 > 10)) 
	        {
	            do 
	            {
	                System.out.println("NOTA INVÁLIDA!");
	                System.out.println();
	                System.out.println("DIGITE UMA NOTA VÁLIDA: ");
	                nota2 = sc.nextDouble();
	            }
	            while (nota2 < 0 || nota2 > 10);
	        }
		
	      double media = (nota1 + nota2) / 2;
	      System.out.printf("MÉDIA = %.2f", media);
		
		sc.close();
	}

}
