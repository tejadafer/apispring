
package practica1;

import java.util.Scanner;

public class Practica1 
{
//alt shift f ordena el codigo
 
    public static void main(String[] args) 
    {
        short edad;
        Scanner leerTeclado = new Scanner(System.in);
        System.out.println("ingrese su edad");
        edad= leerTeclado.nextShort();
        System.out.println("su edad es: "+ edad);
    }
    
}
