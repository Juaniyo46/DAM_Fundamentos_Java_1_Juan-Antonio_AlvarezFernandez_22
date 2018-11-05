package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main<Ejercicio5> {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc1 = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio se pediran dos numeros y el usuario elegira que ejercicios de los anteriores 10, 11 o 12 hacer.");

        //Pedimos al usuario que introduzca el número del menú
        System.out.println("Introduzca el número de ejercicio a realizar (10, 11 o 12)");
        //Guardamos en la variable el primer valor
        int numEjercicio = sc1.nextInt();

        if (numEjercicio==10) {
            Ejercicio10();

        } else if (numEjercicio==11) {
            Ejercicio11();
        }else if (numEjercicio==12) {
            Ejercicio12();
        }else System.out.println("El número introducido no corresponde con ningún ejercicio");




    }

    public static void Ejercicio10 () {
        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá un numero entre 0 y 9999 y mostrara el número de cifras");

        //Pedimos al usuario que introduzca el primer número
        System.out.println("Introduzca un número dentro del rango");
        //Guardamos en la variable el primer valor
        int num1 = sc.nextInt();

        //Se hacen las comparaciones y operaciones para mostrar el numero de cifras.
        if (num1>=0&&num1<=9999) {
            String num = String.valueOf(num1);
            System.out.println("El numero introducido tiene "+num.length()+" cifras");

        } else {
            System.out.println("El número introducido esta fura del rango 0 y 9999");
        }
    }

    public static void Ejercicio11 () {
        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá un numero entre 0 y 9999 y mostrara las cifras al revés");

        //Pedimos al usuario que introduzca el primer número
        System.out.println("Introduzca un número dentro del rango");
        //Guardamos en la variable el primer valor
        int num1 = sc.nextInt();

        //Se hacen las comparaciones y operaciones para mostrar el numero de cifras.
        if (num1>=0&&num1<=9999) {
            String num = String.valueOf(num1);
            String reves ="";

            char[] numReves = num.toCharArray();

            for (int i=numReves.length-1; i>-1;i--) {
                reves+=numReves[i]+"";
            }
            System.out.println("El numero introducido con las cifras al reves es: "+reves);

        } else {
            System.out.println("El número introducido esta fura del rango 0 y 9999");
        }
    }

    public static void Ejercicio12 () {
        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá un numero y le programa dira si es capicua o no");

        //Pedimos al usuario que introduzca el primer número
        System.out.println("Introduzca un número dentro del rango 0 y 9999");
        //Guardamos en la variable el primer valor
        int num1 = sc.nextInt();

        //Se hacen las comparaciones para averiguar el número al reves y despues compararlo con el numero normal
        if (num1>=0&&num1<=9999) {
            String num = String.valueOf(num1);
            String reves ="";

            char[] numReves = num.toCharArray();

            for (int i=numReves.length-1; i>-1;i--) {
                reves+=numReves[i];
            }
            if (reves.equals(num)) {
                System.out.println("El número es capicua");
            } else System.out.println("El número no es capicua");


        } else {
            System.out.println("El número introducido esta fuera del rango 0 y 9999");
        }

    }

}