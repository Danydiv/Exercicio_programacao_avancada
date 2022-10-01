package exercicios_pooa;

import java.util.Scanner;

public class Questao7 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: "); //solicitação
		int numero = sc.nextInt(); // armazenar solicitação
		
		int resto = numero; // declaramos uma variavel auxiliar para armazenar o valor variável
		
		int cemr = resto/100; // declarar uma variavel que dentro dela terá o valor (solicitado, dividio pela qunt de notas)
		resto= resto % 100; // o resto da divisão por 100
	    int cinquentar = resto/50;
		resto = resto % 50;
		int vinter = resto/20;
		resto = resto % 20;
		int dezr = resto/10;
		resto = resto % 10;
		int cincor = resto/5;
		resto = resto % 5;
		int doisr = resto/2;
		resto = resto % 2;
		int umr = resto/1;
		resto = resto % 1;
		
		
		System.out.println(numero); // caso não tivesse a variavel auxiliar, aqui aparecia zero, pois a tendência é um zero (0 < N < 1000000).
		System.out.printf("%d nota(s) de R$ 100,00\n",cemr);
		System.out.printf("%d nota(s) de R$ 50,00\n",cinquentar);
		System.out.printf("%d nota(s) de R$ 20,00\n",vinter);
		System.out.printf("%d nota(s) de R$ 10,00\n",dezr);
		System.out.printf("%d nota(s) de R$ 5,00\n",cincor);
		System.out.printf("%d nota(s) de R$ 2,00\n",doisr);
		System.out.printf("%d nota(s) de R$ 1,00\n",umr);
		
		sc.close();

	}

}
