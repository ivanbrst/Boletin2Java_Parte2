import java.util.Scanner;

public class Ejercicio9{
	
	public static void main (String args[]){
		
		int alto;
		int longo;
		int contaf;
		int contac;
		
		Scanner a=new Scanner(System.in);
		System.out.println("Introduzca o número");
		
		longo=a.nextInt();
		
		alto=longo;
		
		if((longo>3)&&(longo<15)&&(longo%2!=0))
			{
				
				
				//Parte de arriba
				
				for(contaf=0; contaf<longo/2+1; contaf++)
				
					
					{for(contac=1; contac<=longo; contac++)
					
						{if((contac==longo/2+1+contaf) | (contac==longo/2+1-contaf))
							{System.out.print("*");}
						else{System.out.print(" ");}
						}
						System.out.println("");}
						
			
						
						
			}
			else{System.out.println("Error");}
		
					
					
					
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}