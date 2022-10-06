package exercicios_pooa;

import java.util.Scanner;

public class Questao37 
{

	public static void main(String[] args)
	{
		Scanner scan =  new Scanner(System.in);

        System.out.print("Digite seu nome, e depois a sua escolha - PAR ou ÍMPAR: ");
        String n1 = scan.nextLine();
        String x1 = scan.nextLine();
        
        System.out.print("Digite o número desejado: ");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite seu nome, e depois a sua escolha - PAR ou ÍMPAR: ");
        String n2 = scan.nextLine();
        String x2 = scan.nextLine();
        System.out.print("Digite o número desejado: ");
        int num2 = scan.nextInt();

        int soma = num1 + num2;

        if (soma%2 == 0 && x1.equals("PAR")) 
        {
            System.out.println(n1);
        } 
        else if(!(soma%2 == 0) && x1.equals("ÍMPAR")) 
        {
            System.out.println(n1);
        }
        else if((soma%2 == 0) && x2.equals("PAR"))
        {
            System.out.println(n2);
        }
        else if(!(soma%2 == 0) && x2.equals("IMPAR")) 
        {
            System.out.println(n2);
        }

        
        scan.close();

	}

}
