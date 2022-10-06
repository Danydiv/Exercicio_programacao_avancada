package exercicios_pooa;

import java.util.Scanner;

public class Questao45 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float[] idade = new float[5];
		String[] nome = new String[5];
		
		float soma = 0;
		float novo=10000;
		String nomeNovo="";
		float velho=idade[0];
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Nome: ");
			nome[i] = sc.nextLine();
			System.out.println("Idade: ");
			idade[i] = sc.nextFloat();	
			sc.nextLine();
			
			soma+= idade[i];
		}
		
		for (int i = 0; i < nome.length; i++) {
			if(novo > idade[i]) {
				novo = idade[i];
				nomeNovo = nome[i];
			}
				
			if(velho < idade[i])
				velho = idade[i];
		}
		
		float media = soma/5;
		
		System.out.println("Maior idade: "+ (int)velho);
		System.out.println("Nome do mais novo: "+nomeNovo);
		System.out.println("Média das idades: "+media);

	}

}
