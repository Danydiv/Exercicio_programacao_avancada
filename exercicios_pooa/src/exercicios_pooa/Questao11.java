package exercicios_pooa;

import java.util.Scanner;

public class Questao11 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a hora do inicio e fim do jogo: ");
		int horainicio = sc.nextInt();
		int horafim = sc.nextInt();
		
		if (horainicio > horafim)
		{ 
			int contagem = 24 - (horainicio - horafim);
			
			System.out.printf("O JOGO DUROU %d HORA(S)",contagem);
		}
		else if (horafim > horainicio)
		{   
			int contagem2 = (horafim - horainicio);
			
			System.out.printf("O JOGO DUROU %d HORA(S)",contagem2);
		} 
		else 
		{
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		
		sc.close();

	}

}
