package org.diegoestrada;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    static  Scanner src = new Scanner(System.in);
    public static void main(String[] args) {
        //Uso de ternarias para validar si los metodos son true o false
        String varTrue = "valido";
        String varFlase = "invalido";

        System.out.println("Ingrese carnet");
        String result= carnetUniversitario() == true ? varTrue : varFlase;
        System.out.println(result);

        System.out.println("Ingrese correo");
        String result2 = correoInstitucional()== true ? varTrue : varFlase;
        System.out.println(result2);

        System.out.println("Ingrese numero de celular");
        String result3 = numeroTelefono()== true ? varTrue : varFlase;
        System.out.println(result3);
    }

    //Valida el carnet ejemplo 202505250
    public static boolean carnetUniversitario(){
        String evaluar = src.nextLine();
        String regex = "\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(evaluar);
        if(matcher.matches()){
            return true;
        }
        return false;
    }

    public static boolean correoInstitucional(){
        String regex = "^[^._]*@usac\\.edu\\.gt$";
        String evaluar = src.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(evaluar);
        if(matcher.matches()){
            return true;
        }
        return false;
    }

    public static boolean numeroTelefono(){
        //
        String regex = "^[3-6]\\d{3}-?\\d{4}$";
        String evaluar = src.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(evaluar);
        if(matcher.matches())return true;
        return false;
    }

}