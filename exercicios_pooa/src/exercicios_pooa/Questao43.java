package exercicios_pooa;

import java.util.Scanner;

public class Questao43 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double notas[] = {2,5,10,20,50,100};
		System.out.println("Digite o preço: ");
		double N =sc.nextInt();
		System.out.println("Digite o valor pago: ");
		double M =sc.nextInt();
		double result = M-N;			
		boolean possivel = false;
		
		for (int i = 0; i < 6; i++) {				
			for (int j = 0; j < 6; j++) {
				if (result - notas[j] == notas[i]) 
					possivel = true;
			}
		}
    		
		if (possivel)
			System.out.println("Possível");
		else 
			System.out.println("Impossível");

	}

}
