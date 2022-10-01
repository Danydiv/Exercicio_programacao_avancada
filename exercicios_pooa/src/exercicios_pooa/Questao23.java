package exercicios_pooa;

import java.util.Scanner;

public class Questao23 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite dois numeros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 > n2)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		if(n1 == n2)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		if(n1 < n2)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		if(n1 != n2)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		if(n1 >= n2)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		if(n1 <= n2)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}	
		
		sc.close();

	}

}
