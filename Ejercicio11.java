package boletin2java;

import java.util.Scanner;

public class Ejercicio11{
    

    public static void main (String args[]){
        

        int dia;
        int mes;
        int ano;
        int numero;
        int lucky;
        int digito;
        
        lucky=0; 
        
        Scanner a=new Scanner(System.in);
        System.out.println("Introduzca o día que naceu"); 
        dia=a.nextInt();
               
        System.out.println("Introduzca o mes que naceu");
        mes=a.nextInt();
        
        System.out.println("Introduzca o ano que naceu");
        ano=a.nextInt();
        
        numero=dia+ano+mes;
        
        while((lucky>=10) | (lucky==0)){
            
            lucky=0; 
            
            while(numero>0){
                digito=numero%10;
                numero=numero/10;
                lucky=lucky+digito;
            }
            
            numero=lucky;
            
        }    
            
            
    
        System.out.println("O número da sorte é "+lucky+"");

    }
}


