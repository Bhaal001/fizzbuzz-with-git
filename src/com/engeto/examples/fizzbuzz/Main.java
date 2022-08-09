package com.engeto.examples.fizzbuzz;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 101 ; i++) {

            if (i % 3 == 0){ //zbytek po dělení 3 je nula

                System.out.println("Fizz");
            } else

            if (i % 5 == 0){ //zbytek po dělení 5 je nula
                System.out.println("Buzz");
            } else




            System.out.println(i);

        }

    }
}
