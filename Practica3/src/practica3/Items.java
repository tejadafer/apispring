package practica3;

import java.util.Scanner;


public class Items {
    public void ejercicio1(){
        byte suma1 = 0;
        for (byte i = 1; i <= 10; i++) {
        suma1 = (byte) (suma1 + i);
        System.out.println("resultado1 = " + suma1);
        }
    }
    
    public void ejercicio2(){
        String nombre;
        short edad;
        float sueldo;
        Scanner leerTeclado = new Scanner(System.in);
        System.out.println("ingrese su Nombre ");
        nombre = leerTeclado.nextLine();
        Scanner leerTeclado1 = new Scanner(System.in);
        System.out.println("ingrese su Edad ");
        edad = leerTeclado1.nextShort();
        Scanner leerTeclado2 = new Scanner(System.in);
        System.out.println("ingrese su Sueldo ");
        sueldo = leerTeclado2.nextFloat();
        if (edad >= 45) {
            sueldo = sueldo+(sueldo*20/100);}
        else  {sueldo = sueldo+(sueldo*5/100);}
        System.out.println(" Nombre: "+ nombre); 
        System.out.println(" Sueldo Final: "+ sueldo); 
    }
    public void ejercicio3(){
        int suma = 0;
        int i=0;
        do {
            Scanner leerTeclado = new Scanner(System.in);
            System.out.println("ingrese un numero  --  para salir ingrese 0 ");
            i = leerTeclado.nextInt();
            suma = suma + i;
            } while (i != 0);
        System.out.println("resultadode la suma = "+ suma);
        
      
        }
    public void ejercicio4(){
        byte contP = 0;
        byte contI = 0;
        for (byte i = 1; i <= 10; i++) {
            Scanner leerTeclado = new Scanner(System.in);
            System.out.print("ingrese 10 numeros enteros ");
            int num = leerTeclado.nextInt();
            if (num%2 == 0){contP++;}
            else {contI++;}
        }
        System.out.println("resultado de Pares = "+ contP);
        System.out.println("resultado de Inpares = "+ contI);
        }
    public void ejercicio5(){
        Scanner leerTeclado = new Scanner(System.in);
        System.out.print("ingrese la EDAD del Alumno ");
        int edad = leerTeclado.nextInt();
        if (edad >=4 && edad<=6) {
            System.out.println("Lunes y Miércoles de 16 a 17");}
            else if (edad>= 7 && edad<= 8){
                System.out.println("Martes y Jueves de 16:30 a 17:30");}
                else {System.err.println("Fuera de rango de edades");}
        
        }
    public void ejercicio6(){
        int vector[]= new int[5];
        int mayor=0;
        Scanner leerTeclado = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.print("ingrese un numero ");
            vector[i] = leerTeclado.nextInt();
        }
        for (int i=0; i<5; i++){
            if (vector[i]>= mayor)
            mayor=vector[i];
        }
        System.out.println("el mayor numero es " + mayor);
    }
}
