
package arreglos;

import java.util.Scanner;

public class ejemplos {
    public void vector1(){
        /*Llevar a cabo un programa que incluya un vector que almacene 
        los nombres: Alejandra, Leonardo, Rosa, Guillermo, Daniel, María y Ana. 
        Realizar un recorrido del vector para cargar los datos y otro recorrido 
        para mostrar los mismos por pantalla.*/
        System.out.println("ingrese su Nombre ");
        String nombre = leerS();
        System.out.println("iescribio " + nombre);
    } 
    public void vector2(){
        /*Realizar un programa que permita la carga de 10 números en un vector.
        Una vez cargados, se necesita que el programa cuente e informe 
        por pantalla cuántas veces se cargó el número 3.*/
        double vector[]= new double[10];
        int cont=0;
        for (int i=0; i<vector.length; i++){
        System.out.println("ingrese su Numero... SON:  " + (vector.length-i));
        vector[i] = leerN();
        if (vector[i] == 3){ cont++;}
        //System.out.println("iescribio " + nombre);
        }
        System.out.println("La cantidad de Nro 3 es:...   " + cont);
    
    } 
    
    
    
    public String leerS(){
        Scanner leerTeclado = new Scanner(System.in);
        return(leerTeclado.nextLine());
    }
     public double leerN(){
        Scanner leerTeclado = new Scanner(System.in);
        return(leerTeclado.nextDouble());
    }
}
