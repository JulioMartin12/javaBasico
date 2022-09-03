package com.company;

public class Funciones {
    public static void main(String[] args) {

        holamundo();
        holamundo("Julio");

        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");

        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
    }


    private static void holamundo(){
        System.out.printf("Hola Mundo desde un metodo");
    }

    private static void holamundo(String name){
        System.out.printf("Hola " + name);
    }

    private static String devolverHolaMundo(){
        return "";
    }


}
