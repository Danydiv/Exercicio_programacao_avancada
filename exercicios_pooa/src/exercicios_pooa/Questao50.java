package exercicios_pooa;

import java.util.Scanner;

public class Questao50
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de andar: ");
		int qtd = sc.nextInt();
		
		int qtd2 = qtd;
	     
		
		for(int i = 0; i <= qtd; i++) 
		{
			String n = Integer.toString(i);
			if(n.contains("13") || n.contains("4")) 
			{				
					qtd2++;				
			}
			
		System.out.println(qtd2+" - "+i);
		}
		
		if(Integer.toString(qtd2).contains("13"))
		{
			qtd2++;
		}
		if(Integer.toString(qtd2).contains("4")) 
		{
			qtd2++;
		}


        System.out.println(qtd2);


	}

}
