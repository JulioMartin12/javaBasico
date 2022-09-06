package com.company;

public class While {
    public static void main(String[] args) {
        boolean check = true;
        int count = 0;
        while (count < 10){
            count++; // Condición
            if (count == 6)
                break; // rompe el flujo de ejecución
                //continue; // Salta el valor 6 y continúa a la siguiente iteración
            System.out.println("Hola mundo. " + count);

        }
        System.out.println("Fin.");
    }
}
