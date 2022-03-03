//1) Construya un algoritmo que, teniendo una matriz de 5 x 5 elementos enteros, utilice
//métodos (procedimientos y/o funciones) para lograr que:
//a. Complete con valores entre 1 y 100, colocados al azar.
//b. Muestre la matriz en forma rectangular.
//c. Ordene los valores de cada columna de menor a mayor.
//d. Muestre nuevamente la matriz.
//e. Transponga la matriz.
//f. Muestre la matriz nuevamente.
package practico6;


public class Practico6 {

    
    public static void main(String[] args) {
    
        int matriz [][]= new int[5][5];
        int matriz2 [][]=new int[5][5];
         int uno=0,dos=0,tres=0,cuatro=0,cinco=0;
         int vector []= new int [5];
         
    
        rellenaMatriz(matriz);
        
        System.out.println("");
        
        muestraMatriz(matriz);
        
        System.out.println("");
       
        transponerM(matriz, matriz2);
        
        System.out.println("");
        
        muestraMatriz2(matriz2);
        
    }

    public static void rellenaMatriz(int matriz [][])
    
    {
        for (int f=0;f<matriz.length;f++){
             for(int c=0;c<matriz[0].length;c++){
                    matriz[f][c]=(int)(Math.random()*100);
                }    
        }    
        
    }
    public static void muestraMatriz( int matriz [][])
    
    {
         for(int f=0;f<matriz.length;f++){
                for(int c=0;c<matriz[0].length;c++)
                    System.out.print(matriz[f][c]+"-");
                    System.out.println(""); 
        }
    }
    
   
    
    public static int [][] transponerM( int matriz[][],int matriz2[][])
    {
        for(int f=0;f<matriz2.length;f++){
                for(int c=0;c<matriz2[0].length;c++){
                    matriz2[c][f]=matriz[f][c];
                    
             } 
        }return matriz2; 
        
      
    }   
    public static void muestraMatriz2( int matriz2 [][])
    
    {
          for(int f=0;f<matriz2.length;f++){
                for(int c=0;c<matriz2[0].length;c++)
                    System.out.print(matriz2[f][c]+"-");
                    System.out.println(""); 
        }
       
    }

    public static void ordenaMatriz (int matriz[][])
    {
        
    }
    
}
   

  
