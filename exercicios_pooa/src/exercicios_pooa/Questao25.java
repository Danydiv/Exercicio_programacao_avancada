package exercicios_pooa;

import java.util.Scanner;

public class Questao25 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		 		
		System.out.println("Possui interface Gráfica?: ");
		int requesito1 = sc.nextInt();
		System.out.println("Possui interface Gráfica?: ");
		int requesito2 = sc.nextInt();
		System.out.println("Possui interface Gráfica?: ");
		int requesito3 = sc.nextInt();
		System.out.println("Possui interface Gráfica?: ");
		int requesito4 = sc.nextInt();
		System.out.println("Possui interface Gráfica?: ");
		int requesito5 = sc.nextInt();
	
		if(requesito1 == 1 | requesito2 == 1 && requesito3 == 1 && requesito4 == 1 && requesito5 == 1) 
		{
			System.out.println("AVALIADO");
		} 
		else
		{
			System.out.println("0 (ZERO)");
		}
		
		sc.close();
	}

}
			

