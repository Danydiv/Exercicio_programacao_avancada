package exercicios_pooa;

import java.util.Scanner;

public class Questao12 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // ler e armazenar
		
		System.out.println("Digite as tr�s palavras: ");
		
		String p1 = sc.next(); // opcoes das palavras
		String p2 = sc.next(); 
		String p3 = sc.next();
		
		// primeira condi��o
		if (p1.equalsIgnoreCase("vertebrado") && p2.equalsIgnoreCase("ave") && p3.equalsIgnoreCase("carnivoro"))
		{
			
			
			System.out.println("�guia");
			
		}	
		else if (p1.equalsIgnoreCase("vertebrado") && p2.equalsIgnoreCase("ave") && p3.equalsIgnoreCase("onivoro"))
		{
			System.out.println("pomba");
		}
		
		// segunda condi��o
		if (p1.equalsIgnoreCase("vertebrado") && p2.equalsIgnoreCase("mamifero") && p3.equalsIgnoreCase("onivoro"))
		{
			System.out.println("homem");
		}	
		else if (p1.equalsIgnoreCase("vertebrado") && p2.equalsIgnoreCase("mamifero") && p3.equalsIgnoreCase("herbivoro"))
		{
			System.out.println("vaca");
		}
		
		// terceira condi��o
		if (p1.equalsIgnoreCase("invertebrado") && p2.equalsIgnoreCase("inseto") && p3.equalsIgnoreCase("hematofago"))
		{
			System.out.println("pulga");
		}	
		else if (p1.equalsIgnoreCase("invertebrado") && p2.equalsIgnoreCase("inseto") && p3.equalsIgnoreCase("herbivoro"))
		{
			System.out.println("largata");
		}
		
		// terceira condi��o
		if (p1.equalsIgnoreCase("invertebrado") && p2.equalsIgnoreCase("aniledeo") && p3.equalsIgnoreCase("hematofago"))
		{
			System.out.println("sanguessuga");
		}	
		else if (p1.equalsIgnoreCase("invertebrado") && p2.equalsIgnoreCase("aniledeo") && p3.equalsIgnoreCase("onivoro"))
		{
			System.out.println("minhoca");
		}
		sc.close();
	}
}
