package com.company;

public class IfElse {
    public static void main(String[] args) {
        boolean check = 5 < 10;
        int numero1 = 5;
        int numero2 = 10;
        int numero3 = 20;

        if (numero1 < numero2 && numero2 < numero3 ){
            System.out.printf("verdadero");
        }else{
            System.out.printf("falso");
        }
    }
}
