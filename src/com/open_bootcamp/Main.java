package com.open_bootcamp;

public class Main {

    private static int contador = 0;

    public static void main(String[] args) {
        int result1 = suma(1, 2);
        int result2 = suma(1,2);

        System.out.println(result1 + " " + result2);
        System.out.println(contador);

    }

    public static int suma(int a, int b){
//        contador +=1;
        return a+b;
    }
}
