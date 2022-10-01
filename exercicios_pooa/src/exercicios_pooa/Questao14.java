package exercicios_pooa;

import java.util.Scanner;

public class Questao14 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int aux=0, valor;// Declaração de variaveis
		System.out.println("Digite um valor: ");//solicitação ao usuário
        valor = sc.nextInt();
        
		
			if (valor % 2 ==0)// condição para numeros pares
		        {
					valor++;
			    }
			
			while (aux < 6) // condição para rodar 6 vezes
			{
				System.out.printf("%d\n", valor);
			    
				aux++;
			    valor += 2;
			 }
		
		
		sc.close();

	}

}
