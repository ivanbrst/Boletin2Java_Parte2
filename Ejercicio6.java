
import java.util.Scanner;

public class Ejercicio6{
	
	public static void main (String args[]){
		
		int ancho;
		int longo;
		
		int contador;
		
		Scanner a=new Scanner(System.in);
		System.out.println("Introduzca o longo que desexe");
		longo=a.nextInt();
		
		System.out.println("Introduzca o ancho que desexe");
		ancho=a.nextInt();
		
		contador=0;
		
		while(contador<ancho)
			{System.out.print("*");
			contador++;}
		
		System.out.println("");
				
		contador=0;
		
		while(contador<ancho)
		{System.out.print("*");
		contador++;}
			
		System.out.println("");
		
		
		
		
	}
}
