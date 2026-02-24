package org.example;


import java.util.Scanner;

public class Main {

    static Scanner src = new Scanner(System.in);
    static double num1 = 0, num2 = 0;
    static int opcion =0;

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        //Menu de elementos

        do {
            System.out.println("---------Bienvenido a la Calculadora -----------------");
            System.out.println("Menu Principal, Porfavor elije una opcion");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz");
            System.out.println("7. Salir");
            opcion = src.nextInt();
            src.nextLine();

            switch (opcion) {
                case 1:
                    pedirNumeros();
                    sumar(num1, num2);
                    break;
                case 2:
                    pedirNumeros();
                    restar(num1, num2);
                    break;
                case 3:
                    pedirNumeros();
                    multiplicacion(num1, num2);
                    break;
                case 4:
                    pedirNumeros();
                    division(num1, num2);
                    break;
                case 5:
                    pedirNumeros();
                    potencia(num1, num2);
                    break;
                case 6:
                    pedirNumeros();
                    raiz(num1, num2);
                    break;
                case 7:
                    System.out.println("Bye");
                    System.exit(0);
                default:
                    System.err.println("Porfavor ingrese una opcion valida");
                    break;
            }
        }while (opcion != 7);
    }

    static void sumar(double a, double b) {
        System.out.println("El resultado de la suma es: " + (a+b));
    }

    static void restar(double num1, double num2) {
        System.out.println("El resultado de la resta es: " + (num1-num2));
    }
    static void multiplicacion(double num1, double num2) {
        System.out.println("El resultado de la multiplicacion es: " + num1*num2);
    }

    static void division(double num1, double num2) {
        System.out.println("El resultado de la division es: " + (num1/num2));
    }

    static void potencia(double num1, double num2) {
        double num = Math.pow(num1, num2);
        System.out.println("El resultado potencia es: " + (num));

    }

    static void raiz(double num1, double num2) {
        double num = Math.pow(num1,1/num2);
        System.out.println("El resultado de la raiz es: " + (num));
    }

    static void pedirNumeros(){
        System.out.println("Ingrese los numeros a operar ");
        System.out.print("a=");
        num1 = src.nextDouble();
        System.out.print("b=");
        num2 = src.nextDouble();
    }

}