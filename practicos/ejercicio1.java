//ejercicio3

//a) son dos funciones llamadas actuar
//b) las dos devuelven un entero
//c) 2 parámetros
//d) 1 parámetro
//f) devuelve 605, 480 y 1206
//g) No da error, son compatibles gracais al polimorfismo
public class ejercicio1 {

   public static void main(String[] args) {
//ejercicio1y2
    
    int a = actuar(5,'y');
    System.out.println(a);
    int b = actuar(4,(char)120);
    System.out.println(b);
    System.out.println( actuar(11,'m')+actuar("Mendoza") ) ;
       
    }
  

   public static int actuar(int a,char b)
{  
 int c=(int)b;   
 return a*c;   
}


   public static int actuar(String c)
{
 return c.length();  
}        

}
