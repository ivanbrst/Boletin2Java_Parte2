import java.util.Scanner;

public class Ejercicio8{
	
	public static void main(String args[]){
		
		int largo;
		int alto;
		int i;
		int j;
		
		
		Scanner a=new Scanner(System.in);
		System.out.println("Introduzca un número entre 3 e 10");
		
		alto=a.nextInt();
		
		largo=alto*2;

		if((alto>=3) && (alto<=10))
		{
			for(i=0; i<alto; i++)
				{for(j=0; j<largo; j++)
					{if((j>i)&&(j<largo-i-1))						
						{System.out.print(" ");}
					else{System.out.print("*");}}
					
					
					
					
				System.out.println("");}

		
		
				}
				
		}
	}


		
		
	


	
