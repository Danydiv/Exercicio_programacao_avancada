package exercicios_pooa;

import java.util.Locale;
import java.util.Scanner;

public class Questao27
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite suas 4 medições do dia: ");
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int v3 = sc.nextInt();
		int v4 = sc.nextInt();
		
		double valorTotal = (v1+v2+v3+v4)/4;
		
	
		
		//valores v1
		if(v1 < 110)
			{   
				System.out.printf("%s NORMAL\n", v1);
			}
		else if(v1 >= 110 & v1 < 125)
			{				
				System.out.printf("%s ALTERADA\n", v1);
			}
		else if (v1 > 125)
			{
				System.out.printf("%s MUITO ALTA\n", v1);
			}
		
		//valores v2
		if(v2 < 110)
			{   
				System.out.printf("%s NORMAL\n", v2);
			}
		else if(v2 >= 110 & v2 < 125)
			{
				System.out.printf("%s ALTERADA\n", v2);
			}
		else if (v2 > 125)
			{
				System.out.printf("%s MUITO ALTA\n", v2);
			}
		
		//valores v3
		if(v3 < 110)
			{   
				System.out.printf("%s NORMAL\n",v3);
			}
		else if(v3 >= 110 & v3 < 125)
			{
				System.out.printf("%s ALTERADA\n", v3);
			}
		else if (v3 > 125)
			{
				System.out.printf("%s MUITO ALTA\n", v3);
			}
		
		//valores v4
		if(v4 < 110)
			{   
				System.out.printf("%s NORMAL\n",v4);
			}
		else if(v4 >= 110 & v4 < 125)
			{
				System.out.printf("%s ALTERADA\n", v4);
			}
		else if (v4 > 125)
			{
				System.out.printf("%s MUITO ALTA\n", v4);
			}
		System.out.printf("MÉDIA DAS LEITURAS = %.2f", valorTotal);
	}

}
