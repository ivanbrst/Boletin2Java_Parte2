package boletin2java;

import java.util.Scanner;

public class Ejercicio10{
    

    public static void main (String args[]){
        
        int numero;
        int espacios;
        int primera;
        int contador;
        int ultima;
        Scanner a = new Scanner(System.in);
        
        primera=2;
        ultima=0;

        System.out.println("Introduzca o número para o alto da pirámide");
        numero = a.nextInt();

        //Número superior
        
        for (int i = 0; i < numero-1; i++) {
            System.out.print(" ");
        }
        System.out.println("1");

        //Resto de la pirámide
        
        espacios = numero-2;
        for (int i = 2; i <= numero; i++) {
            
            // Para los espacios
            
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            
            // Numeros central de cada fila
            
            contador = primera;
            for (int j = 0; j < i; j++) {
                System.out.print(contador);
                ultima = contador;
                if (contador == 9) {
                    contador = 0;
                } else {
                    contador++;
                }
            }
            


            // Numeros izquierda y derecha
            
  
            contador = ultima-1;
            for (int j = 0; j < i - 1; j++) {
                System.out.print(contador);
                if (contador == 0) {
                    contador = 9;
                } else {
                    contador--;
                }
            }
            System.out.println("");
            if (primera == 9) {
                primera = 0;
            } else {
                primera++;
            }
            espacios--;
        
        
        
 
        
        
    }
    
    }
}
