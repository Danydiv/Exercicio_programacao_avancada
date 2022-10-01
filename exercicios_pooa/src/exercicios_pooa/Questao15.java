package exercicios_pooa;

import java.util.Scanner;

public class Questao15 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");//solicitação ao usuário
        int valor = sc.nextInt();
        
		int s1=0,s2=1;
        for (int i=0;i<valor;i++)
        {        	
        	System.out.printf("%d ",s1);
        	s1=s1+s2;
        	s2=s1-s2;
        	
        }
		sc.close();

	}

}
