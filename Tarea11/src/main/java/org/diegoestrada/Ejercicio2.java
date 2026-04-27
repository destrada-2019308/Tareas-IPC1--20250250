package org.diegoestrada;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    static final String cadena = "UNIVERSIDAD DE SAN CARLOS DE GUATEMALA\n" +
                            "Facultad de Ingeniería — Boletín Informativo 2024-04-25\n" +
                            "Actividades programadas:\n" +
                            "-\n" +
                            "Conferencia el 2024-05-01 a las 10:30 en el Edificio T3\n" +
                            "-\n" +
                            "Examen parcial el 2024-05-15 a las 08:00 en el Edificio S11\n" +
                            "-\n" +
                            "Defensa de proyecto el 2024-06-10 a las 14:30 en el Edificio T7\n" +
                            "Contactos del departamento:\n" +
                            "-\n" +
                            "Coordinador: coord.ipc1@ingenieria.usac.edu.gt Tel: 2418-8000\n" +
                            "-\n" +
                            "Auxiliar 1: aux01_ipc1@ingenieria.usac.edu.gt Tel: 5555-1234\n" +
                            "-\n" +
                            "Auxiliar 2: aux02.ipc1@gmail.com Tel: 4321-9876";
    public static void main(String[] args) {
        // -------------------- EXTRAYENDO DATOS ------------------------------
        System.out.println("-------------------- EXTRAYENDO DATOS ------------------------------");
        extraerFechas();
        // -------------------- EXTRAYENDO DATOS ------------------------------
        System.out.println("-------------------- EXTRAYENDO DATOS ------------------------------");
        extaerCorreos();
        // -------------------- EXTRAYENDO DATOS ------------------------------
        System.out.println("-------------------- EXTRAYENDO DATOS ------------------------------");
        System.out.println(censurarDatos());
    }

    public static void extraerFechas(){
        Pattern pattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher  matcher = pattern.matcher(cadena);
        while (matcher.find()){
            String year = matcher.group(1);
            String month = matcher.group(2);
            String day = matcher.group(3);
            System.out.println("Año:" + year + "|" + "Mes:" + month + "|" + "Dia:" + day);
        }
    }

    public static void extaerCorreos(){
        Pattern pattern  = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(cadena);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

    //censurar datos sensible
    public static String censurarDatos(){
        Pattern pattern = Pattern.compile("([a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})|(\\d{4}-\\d{4})");
        Matcher matcher = pattern.matcher(cadena);

        StringBuffer sb = new StringBuffer();
        while( matcher.find()){
            if(matcher.group(1) != null){
                matcher.appendReplacement(sb,"[CORREO]");
            }else if(matcher.group(2) != null){
                matcher.appendReplacement(sb,"[TEL]");
            }
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}
