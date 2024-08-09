/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labweek4;

import java.util.Scanner;
import java.util.Random;

public class LaraSamuelPrueba1 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        Random aleatorio=new Random();
        
        int menu=0;
        while(menu!=5){
            do{
                System.out.println("");
                System.out.println("\n1 - Palabra Alreves");
                System.out.println("2 - Numero Perfecto");
                System.out.println("3 - Primos");
                System.out.println("4 - Votaciones");
                System.out.println("5 - Salir del sistema");
                System.out.print("Ingresar opcion a realizar: ");
                menu=lea.nextInt();
                
                if(menu<0||menu>5){
                    System.out.println("Opciones no validas! ");
                }

            }while(menu<0||menu>5);
            
            if(menu==1){
                System.out.print("Ingresar palabra para revertirla: ");
                String palabra=lea.next();
                
                int reversa=palabra.length()-1;
                
                while(reversa>=0){
                    
                    System.out.print(palabra.charAt(reversa));
                    reversa--;
                }
            }else if(menu==2){
                
            }else if(menu==3){
                
            }else if(menu==4){
                
            }else{
                System.out.println("Termino.");
            }
        
        }
    }
}
