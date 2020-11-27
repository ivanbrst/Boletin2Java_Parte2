
import java.util.Scanner;

public class Ejercicio6{
	
	public static void main (String args[]){
		
		int longo;
		int alto;
		
		int contador;
		int saltos;
		
		Scanner a=new Scanner(System.in);
		System.out.println("Introduzca o longo que desexe");
		longo=a.nextInt();
		
		System.out.println("Introduzca o alto que desexe");
		alto=a.nextInt();
		
		contador=0;
		
		while(contador<longo)
			{System.out.print("*");
			contador++;}
		
		System.out.println("");
		
		contador=0;
		saltos=0;
		
		while(saltos<alto-2)
			{while(contador<longo)
				{if((contador==0) | (contador==longo-1))
					{System.out.print("*");}
				else{System.out.print(" ");}
				contador++;}
				contador=0;
				saltos++;
				System.out.println("");}
				
		contador=0;
		
		while(contador<longo)
			{System.out.print("*");
			contador++;}
			
		System.out.println("");
		
		
		
		
	}
}
