//4. Resuelva las siguientes consignas, utilizando una sola sentencia (o dos como
//máximo:

//c) Teniendo un String de más de 20 caracteres, tome los caracteres 1°, 10° y
//20° y obtenga sus códigos ASCII, súmelos y guarde el resultado en una
//variable de tipo String.
//d) Teniendo en memoria el String “murciélago”, haga que se vuelva a guardar
//en memoria, conteniendo las mismas letras pero 3 en mayúscula y 3 en
//minúscula, y así sucesivamente hasta el final.

public class ejercicio4 {


    public static void main(String[] args) {
        //a)
        char s='s',o='o',l='l';
        String cadena;
        cadena=""+s+o+l;
        cadena.toUpperCase();
        System.out.println(cadena+" tiene "+cadena.length()+" letras");
        //b)
        int a=300;
        double raiz=Math.sqrt(a);
        System.out.println("la raíz "+raiz);
        char c=(char)raiz;
        System.out.println(c);
        //c)
        String frase = "holamellamoAndresRiveros";
        char x= frase.charAt(0);
        char y= frase.charAt(9);
        char z= frase.charAt(19);
        int X =(int)x;
        int Z =(int)z;
        int Y =(int)y;
        System.out.println("La suma es: "+(X+Z+Y));    
        //d)
        String cadena2="murciélago";
        cadena2 = cadena2.substring(0,3).toUpperCase() +  cadena2.substring(3,6).toLowerCase() + cadena2.substring(6,9).toUpperCase() + cadena2.substring(9,10).toLowerCase();
		System.out.println(cadena2);

        //ejercicio5
//        1) el primer método es void, el segundo devuelve un entero y el último char
//        2) "SaberCuantos" y "buscarMenorPar" son funciones y "mostrarArreglo" es un procedimiento.
//        3) Si
//        4) "String titulo" es el parametro formal y "String[] arreglo" es el parametro real.
//        5) Se ejecuta un bucle, devuelve un valor par aleatorio menor a 298, devuelve "El numero 298 es el limite", multiplica por 298 el numero random que seria un valor entre 0 y 1.
      
    }
    
}
