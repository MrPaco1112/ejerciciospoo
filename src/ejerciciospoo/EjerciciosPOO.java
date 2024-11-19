// Autor: Juan Esteban Sarmiento Benítez
// Tarea ejercicios de Java :D


package ejerciciospoo;
import java.util.*;

public class EjerciciosPOO {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
    //1
        System.out.println("Hola, ya se imprimir frases");
    //2
        int s=117;
        System.out.println(s);
    //3
        double a=6.89;
        System.out.println(a);
    //4, 5, 6 y 7
        int n1 = 1234;
        int n2 = 532;
        System.out.println(n1 + n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(n1/(float)n2);
    
    //8
        int n4;
        for(n4 = 1;n4<=3;n4++){
            System.out.println(n4);}
        
    //9        
        int n5;
        for(n5 = 1;n5<10;n5++){
            System.out.println(n5);
        }
        
    //10
        int n6;
        for(n6 = 1;n6<=10000;n6++){
            System.out.print(n6 + " ");
            if (n6 % 20 == 0){
            System.out.println();
            }
        }

     //11
        int n7;
        for (n7=5;n7<=10;n7++){
            System.out.print(n7 + " ");
        }
        System.out.println();
    //12
        int n8;
        for (n8=5;n8<=15;n8++){
            System.out.print(n8 + " ");
        }
        System.out.println();
     
    //13
        int n9 ;
        for (n9 = 5; n9<= 15000; n9++){
            System.out.print(n9 + " ");
            if (n9 % 20 == 0){
            System.out.println();
            }
        }

       
        
    //14
        int n10;
        for (n10 = 1; n10<= 200;n10++){
            System.out.print(" Hola " + "   ");
            if (n10 % 10 == 0){
            System.out.println();
            }
        }

    //15
        int n11;
        for (n11 = 1; n11 <= 30; n11++){
            System.out.println(n11 + "^2 es: " + n11*n11);
        }

    //16
        int n12;
        long n13 = 1;
        for (n12 = 1; n12<= 20; n12++){
            n13 *= n12;
            if (n13%20000 == 0){
            System.out.println("El producto de los primeros 20 naturales es: " + n13);
            }
        }
    //17
        int n14;
        int n16 = 0;
        for (n14 = 1; n14 <= 100; n14++){
            int n15 = n14*n14;
            n16 += n15;
            if (n16%338350==0){
            System.out.println("La suma de los cuadrados de los primeros 100 naturales es: " + n16);}
        }
    //18
        
        System.out.println("Ingrese un numero entero: ");
        try{
            long n17 = s.nextLong();
            long n18;
            long n19 = 0;
            for(n18 = n17; n18<n17+100;n18++){
                n19 += n18;
            }
            System.out.println(n19);
        }catch(InputMismatchException e){
            System.out.println("El dato ingresado no es un entero, por favor reintentar");
        }

    //19
        System.out.println("El tipo de cambio actual (15/11/2024) es de 1.053489 USD/EUR");
        System.out.println("Ingrese valor numerico (decimales con ,) en euros a convertir: ");
        try{
            double euro = s.nextDouble();
            double dolar = euro * 1.053489;
            System.out.println("El valor en dolares es: " + dolar);
        }catch(InputMismatchException e){
            System.out.println("El dato ingresado no es numerico, por favor reintentar");
        }

    //20
        System.out.println("Ingrese los datos numericos de ancho y alto del rectangulo para el calculo (decimales con ,)");
        try {
            System.out.println("Ingrese ancho: ");
            double ancho = s.nextDouble();
            System.out.println("Ingrese alto: ");
            double alto = s.nextDouble();
            System.out.println("El area del rectangulo es: " + ancho * alto);
            
        }catch(InputMismatchException e){
            System.out.println("Uno de los datos ingresados no cumple con los parametros, reintentar");
        }

    //21
        System.out.println("Ingrese los numeros a comparar (decimales con ,): ");
         try {
            System.out.println("Ingrese numeros: ");
            double num1 = s.nextDouble();
            double num2 = s.nextDouble();
            System.out.println("El numero mayor es: ");
            if (num1 < num2){
                System.out.println(num2);
            }else if(num2 < num1){
                System.out.println(num1);          
            }else if (num2 == num1){
                System.out.println("Los numeros son iguales");
            }
            
            
        }catch(InputMismatchException e){
            System.out.println("Uno de los datos ingresados no cumple con los parametros, reintentar");
        }
      */   
    //22
        System.out.println("Ingrese numero entero: ");
        int n20 = s.nextInt();
        try {
            for (;n20>=0;n20--){
                if (n20 % 2 != 0){
                    System.out.println(n20);
                } else {
                }
            }
        }catch(InputMismatchException e){
            System.out.println("El dato ingresado no es un numero entero, reintentar");
        }
    //23
        
    }
}