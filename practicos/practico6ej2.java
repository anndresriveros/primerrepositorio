
package practico6;
import javax.swing.*;
import java.util.*;


public class practico6ej2 {

   
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        
        System.out.println("Ingrese su nombre: ");
        
        String nombre = ent.nextLine();
        
        String vector [] = nombre.split("");
        
        mayus(nombre);
        
        String matriz [][]= new String [3][];
        
        int tam=nombre.length();
        
        int indice=(tam/2);
        
        vocalCons(vector,tam,indice);
        
        int cantV= cantVocales(vector);
        System.out.println("la cantidad de vovales es: "+cantV);
        
        int consonantes= (tam-cantV);
        
        System.out.println(" cantidad de consonantes:"+ consonantes);
                
        matriz(vector, matriz, consonantes);
                
      
    }
    public static void mayus( String nombre){
        
        int tam=nombre.length();
        
        int indice=(tam/2);
       
        int fin =(tam-1);
        
        if (tam%2!=0){
        
            nombre=nombre.substring(0, indice).toLowerCase()  +   nombre.substring(indice,indice+1).toUpperCase()  +   nombre.substring(indice+1,fin+1).toLowerCase();
        
        }
        
        System.out.println(nombre);
      
    }
    public static void vocalCons(String [] vector, int tam, int indice){
        
        switch (vector[indice]){
            case "a":
                System.out.println("la letra mayúscula es es vocal");
                break;
            case "e":
                System.out.println("la letra mayúscula es vocal");
                break;
            case "i":
                System.out.println("la letra mayúscula esvocal");
                break;
            case "o":
                System.out.println("la letra mayúscula es vocal");
                break;
            case "u":
                System.out.println("la letra mayúscula es vocal");
                break;
            case "A":
                System.out.println("la letra mayúscula es vocal");
                break;
            case "E":
                System.out.println("la letra mayúscula es vocal");
                break;
            case "I":
                System.out.println("la letra mayúscula es vocal");
                break;
            case "O":
                System.out.println("la letra mayúscula es vocal");
                break;
            case "U":
                System.out.println("la letra mayúscula es vocal");
                break; 
            default:
                System.out.println("la letra es consonante y no es mayúscula");
                    
        }
        
        
    }
    
    
    
    
    public static int cantVocales(String vector[]){
        int cantVocal=0;
       
        for (int i=0;i<vector.length;i++){
            
            if(vector[i].equalsIgnoreCase("a")) {
                cantVocal++;
            }
            if(vector[i].equalsIgnoreCase("e")) {
                cantVocal++;
            }
            if(vector[i].equalsIgnoreCase("i")) {
                cantVocal++;
            }
            if(vector[i].equalsIgnoreCase("o")) {
                cantVocal++;
            }
            if(vector[i].equalsIgnoreCase("u")) {
                cantVocal++;    
                
            }
        }
        return cantVocal;
    
    }
//    d. El cuarto debe tomar las consonantes del nombre y colocarlas en una matriz de 
//tres filas y la cantidad de columnas necesarias para ser completadas (no deben 
//sobrar filas). Luego mostrará la matriz completa en forma rectangular.
public static void matriz(String [] vector, String [][] matriz, int consonantes)
{String consV []=new String [consonantes];
  for (int i=0; i<3;i++){
      if ((vector[i]!="a")||(vector[i]!="e")||(vector[i])!="i"||(vector[i]!="o")||(vector[i]!="u")){
         matriz[0][i]=vector[i]; 
         for (int c=0;c<3;c++){
             matriz[i][0]=vector[i];
         }
      }
     for(int f=0;f<3;f++){
                for(int c=0;c<3;c++)
                    System.out.print(matriz[f][c]+"-");
                    System.out.println(""); 
        }
    
   
}
}
}
            
