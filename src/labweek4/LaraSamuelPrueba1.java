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
        //veces ingresadas a cada programa
        //ejercicio 1
        int pa=0;
        //ejercicio 2
        int np=0;
        //ejercicio 3
        int p=0;
        //ejercicio 4
        int v=0;
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
                    
                    System.out.print("La palabra alreves seria: "+palabra.charAt(reversa));
                    reversa--;
                }
                pa++;
            }else if(menu==2){
                int suma=0;
                System.out.print("Favor ingrese el numero al que desea evaluar: ");
                int numero = lea.nextInt();
                //contador para while
                int cont=1;
                //ciclo while
                while(cont<numero){
                    //evalua si hay residuo
                    if(numero%cont==0) {
                        suma += cont;
                    }
                    cont++;
                }
                if(suma==numero){
                    System.out.println("Numero perfecto.");
                    
                }else{
                    System.out.println("Numero no perfecto.");  
                }         
                np++;
            }else if(menu==3){
                //Random
                int maquina=aleatorio.nextInt(100);
                System.out.print("Numero aleatorio "+maquina);
                
                //contador
                int cont=1;
                //variable verificacion primo
                int primo=0;
                //ciclo while
                while(cont<=maquina){
                    //evalua si hay residuo
                    if(maquina%cont==0) {
                        primo += cont;
                    }
                    cont++;
                }
                if(primo==maquina+1){
                    System.out.println(" es primo");
                    System.out.println(" ");
                    System.out.println("Divisores de "+maquina+": 1 y "+maquina);
                    
                }else{
                    System.out.println(" no es primo");  
                }
                p++;
            }else if(menu==4){
                //llamar objeto Scanner
                String voto=" ";
                //votos para los partidos
                int votoBlue=0;
                int votoRed=0;
                int votoBlack=0;
                int votoYellow=0;
                //votos nulos
                int nulo=0;
                //total de votos
                int total=0;
                System.out.print("Cuantos votantes hay en el pais?: ");
                int votantes=lea.nextInt();
                
                for(int contador=0;votantes>contador;contador++){
//                    do{
                        System.out.println("");
                        System.out.println("**PLANILLA DE VOTOS**");
                        System.out.println("\nAZUL\nROJO\nNEGRO\nAMARILLO");
                        System.out.print("Ingresar por quien va a votar: ");
                        voto=lea.next().toUpperCase();
//                    }while(!voto.equals("AZUL")&&!voto.equals("ROJO")&&!voto.equals("NEGRO")&&!voto.equals("AMARILLO"));
                    
                    if(voto.equals("AZUL")){
                        votoBlue++;
                        total++;
                    }else if(voto.equals("ROJO")){
                        votoRed++;
                        total++;
                    }else if(voto.equals("NEGRO")){
                        votoBlack++;
                        total++;
                    }else if(voto.equals("AMARILLO")){
                        votoYellow++;
                        total++;
                    }else{
                        nulo++;
                        total-=nulo;
                    }
                }
                
                double valido=(total*100)/votantes;
                double azul=(votoBlue*100)/votantes;
                double rojo=(votoRed*100)/votantes;
                double amarillo=(votoYellow*100)/votantes;
                double negro=(votoBlack*100)/votantes;
                
                if(valido>60){
                if(votoBlue>votoRed&&votoBlue>votoBlack&&votoBlue>votoYellow){
                    System.out.println("Ganador partido AZUL con: "+votoBlue+" voto(s)"+" voto(s) y con el porcentaje: "+azul+"% ");
                }else if(votoRed>votoBlue&&votoRed>votoBlack&&votoRed>votoYellow){
                    System.out.println("Ganador partido ROJO con: "+votoRed+" voto(s)"+" voto(s) y con el porcentaje: "+rojo+"% ");
                }else if(votoBlack>votoRed&&votoBlack>votoBlue&&votoBlack>votoYellow){
                    System.out.println("Ganador partido NEGRO con: "+votoBlack+" voto(s)"+" voto(s) y con el porcentaje: "+negro+"% ");
                }else if(votoYellow>votoBlue&&votoYellow>votoRed&&votoYellow>votoBlack){
                    System.out.println("Ganador partido AMARILLO con: "+votoYellow+" voto(s) y con el porcentaje: "+amarillo+"% ");
                }else{
                    System.out.println("Gano nulos");
                }
                }else{
                    System.out.println("No se realizo porque la cantidad de votos validos es el 60% de los votos totales");
                    System.out.println("No gano nadie");
                }
                v++;
            }else{
                System.out.println("Termino.");
                System.out.println("\nPalabra Alreves veces ingresadas: "+pa);
                System.out.println("Numero Perfecto veces ingresadas: "+np);
                System.out.println("Primos veces ingresadas: "+p);
                System.out.println("Votaciones veces ingresadas: "+v);
            }
        
        }
    }
}
