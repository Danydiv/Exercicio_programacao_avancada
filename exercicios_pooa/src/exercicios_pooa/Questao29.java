package exercicios_pooa;

public class Questao29 
{

	public static void main(String[] args) 
	{
		int j = 7, i = 1, cont=1; //declarar dois valores iniciando em 7 e 1 e um contador
	
		System.out.println("I: " + i + " J: " + j);// printar os dois valores iniciais antes do looping
		
		while(true) //enquanto o looping for verdadeiro
		{
			if(j == 5 && i == 9) //condicao para parar o looping quando o j chegar a 5 e i chegar a 9
			{
				break;// break para parar
			}
			cont++;
			j --;
			
			if(j == 4) 
			{
				j = 7;
			}
			
			if(cont == 4) 
			{
				i = 3;
			}
			
			if (cont == 7) {
				i = 9;
			}
			System.out.println("I: " + i + " J: " + j); // printar 
		}
			
			
	}
}





