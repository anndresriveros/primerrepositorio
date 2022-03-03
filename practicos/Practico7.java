
package practico7;
import java.util.*;
public class Practico7 {

  
    public static void main(String[] args) {
        
       
        System.out.println("Ingrese un texto para saber cuántos caracteres ingresados son números (serán impresos)");
        
        Scanner tex = new Scanner (System.in);
        
        tex.useDelimiter("\n");
        
        String texto= tex.next();
        
        System.out.println(texto);
        
        
        numSoN(texto);
        
        System.out.println("");
        
        int f=0;
        
        
        
        
        
        
        do{
         
            System.out.println("Ingrese las filas de la matriz");
        
        f=tex.nextInt();
        
        }while ((f>9)||(f<=0));
        
        int c;
        
        
        System.out.println("");
        
        
        
        do{
          
            System.out.println("Ingrese las columnas de la matriz");
        
        c=tex.nextInt();
        
        }while ((c>9)||(c<=0));
        
        
        
        int [][] matriz = new int [f][c];
        
        float vector[]=new float[c];
        
        
        System.out.println("");
        
        for (int i=0;i <matriz.length; i++){
            for (int j=0;j <matriz[0].length; j++){
                System.out.println("Ingrese valor para el casillero ["+i+"] ["+j+"]");
                matriz[i][j]= tex.nextInt();
            } 
        }
        System.out.println("");
        
        for( int i=0;i<matriz.length;i++){
                for( int j=0;j<matriz[0].length;j++)
                    System.out.print(matriz[i][j]+"-");
                    System.out.println(""); 
        }
        System.out.println("");
        
        
        cant0(f,c,matriz);
        System.out.println("");
        
        float [] z= promF(c,f,matriz,vector);
        System.out.println("");
        
        float mayorValorVector=mayorV(z);
        System.out.println("");
        
    int [][] h=ordenaMatriz(matriz);
    
   
    
    }
    
    
    
    
    
    
    
    
    public static void numSoN (String texto)
    {
        
        String texto1=texto.replace(" ","");
       
        boolean isNumeric=false;
        for (int i=0;i<texto1.length();i++){
            char c=texto1.charAt(i);
            if (Character.isDigit(c)){
                isNumeric= true;
                 
                System.out.println(c);
            }
              
            }
        }
    
    public static void cant0 (int f, int c, int [][]matriz)
    {
        int cant0=0;
         for (int i=0;i <matriz.length; i++){
            for (int j=0;j <matriz[0].length; j++){
            if(matriz[i][j]==0){
                cant0++;
            }
            }
    }
        System.out.println("La cantidad de casilleros con el número 0 es: "+cant0);
    }
    
    public static float [] promF(int c,int f, int matriz [][], float vector[] )
    {
        float cont=0f;
        int div=c;
        float prom=0.0f;
        for (int i=0;i <matriz.length; i++){
            for (int j=0;j <matriz[0].length; j++){
                
                
                cont=cont+matriz[i][j];
                
                }
                prom=(cont/div);
                vector[i]=prom; 
                cont=0;
                    
    }
        for (int x=0;x<vector.length;x++){
               System.out.println("El promedio en la fila "+x+" es: "+vector[x]);
           } 
      return vector;     
    }
public static float  mayorV(float [] z)
{
    float mayor=0.0f;
    
    for (int i=0;i<z.length;i++){
        if(z[i]>mayor){
            mayor=z[i];
        }
        
    }
    System.out.println("El mayor valor del vector ingresado es: "+mayor);
    return mayor;
}
public static int [][] ordenaMatriz (int [][] matriz)
{
    
    for (int i=0;i<matriz.length;i++){
        for( int j=0;j<matriz.length;j++){
            for(int r=0;r<matriz.length;r++){
                for(int h=0;h<matriz.length;h++){
                    if(matriz[i][j]>matriz[r][h]){
                        matriz[i][j]=matriz[i][j];
                    }else{
                        int temp=matriz[r][h];
                        matriz[r][h]=matriz[i][j];
                        matriz[i][j]=temp;
                    }
                }
            }
          
       }
    }
    
    System.out.println("");
        
        for( int i=0;i<matriz.length;i++){
                for( int j=0;j<matriz[0].length;j++)
                    System.out.print(matriz[i][j]+"-");
                    System.out.println(""); 
        }

            
    return matriz;
}

}