package exercicios_pooa;

import java.util.Scanner;

public class Questao5 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);// ler e armazenar valores digitados pelo usu�rio
		
		
		System.out.println("Digite 3 numeros: "); // entrada de dados 
		int v1 = sc.nextInt();// leitura e armazenamento

		//System.out.println("Digite o segundo valor: "); pode conter ou n�o uma solicita��o por n�mero
		int v2 = sc.nextInt();
		
		//System.out.println("Digite o terceiro valor: ");
		int v3 = sc.nextInt();
		
		// condi��o do maior
		if (v1 >= v2 && v1 >= v3) // se v1 for maior que v2 e maior que v3
			System.out.println(v1);// imprima que o maior � v1
		else if (v2 >= v1 && v2 >= v3)// se v2 for maior que v1 e maior que v3
			System.out.println(v2);// imprima que o maior � v2
		else
			System.out.println(v3);// se n imprima que o maior � v3
		
		// condi��o do intermedi�rio
		if (v1 <= v2 && v1 >= v3)// se v1 for menor que v2 e menor que v3
			System.out.println(v1);// imprima v1
		else if (v2 <= v1 && v2 >= v3)// se v2 for menor que v1 e menor que v3
			System.out.println(v2);// imprima que v2
		else
			System.out.println( v3);//se n imprima v3
		
		// condi��o do menor
		if (v1 <= v2 && v1 <= v3)// se v1 for menor que v2 e menor que v3
			System.out.println(v1);// imprima que o menor � v1
		else if (v2 <= v1 && v2 <= v3)// se v2 for menor que v1 e menor que v3
			System.out.println(v2);// imprima que o menor � v2
		else
			System.out.println( v3);//se n imprima que o menor � v3
		
		sc.close();
	}

}
