package exercicios_pooa;

import java.util.Scanner;

public class Questao14 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int aux=0, valor;// Declara��o de variaveis
		System.out.println("Digite um valor: ");//solicita��o ao usu�rio
        valor = sc.nextInt();
        
		
			if (valor % 2 ==0)// condi��o para numeros pares
		        {
					valor++;
			    }
			
			while (aux < 6) // condi��o para rodar 6 vezes
			{
				System.out.printf("%d\n", valor);
			    
				aux++;
			    valor += 2;
			 }
		
		
		sc.close();

	}

}
