package exercicios_pooa;

public class Questao35 
{

	public static void main(String[] args)
	{
		
		double x=0;		
		double y=1;
		
		for (int i = 1; i <= 39; i+=2) 
		{			
			x +=i/y;			
			y *= 2;
		}
			
		System.out.println(x);

	}

}
