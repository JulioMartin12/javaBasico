package com.company;

public class CocheMain {
    public static void main(String[] args) {
        String coche = "alfa romeo";
        Coche cocheObjeto = new Coche("Rojo", "Renault", "2022", 3000d,200d);
        System.out.println(cocheObjeto.toString());
    }
}
