
import java.util.Scanner;

public class Ejercicio7{
	
	public static void main (String args[]){
		
		int n;
		int i;
		int j;
		
		Scanner a=new Scanner(System.in);
		System.out.println("Introduzca un número entre 3 e 7");
		
		n=a.nextInt();
		
		if((n>=3) && (n<=7))
			{for(i=1; i<=n; i++)
				{for (j=0; j<i; j++)
					{System.out.print("*");}
				System.out.println("");}
				
			}
			
		else{System.out.println("Error");}
		
	}

}