package com.company;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        ArrayList numbers = new ArrayList();

        numbers.set(x, y);
        System.out.println("Number of array: " + numbers.size());            // Zjistí počet čísel v arrayi.
        System.out.println("Is the array empty? " + numbers.isEmpty());         // Zjistí jestli je arrray prázdný.
        System.out.println("Position of specific number: " + numbers.indexOf(x));        // Zjistí pozici specifického čísla.
        System.out.println("Get specific number: " + numbers.get(x));            // Získá číslo.
        System.out.println("Does the array contain specific number? " + numbers.contains(x));       //Zjistí jestli seznam obsahuje specifické číslo.
        System.out.println("Last index of array: " + numbers.lastIndexOf(x));    //Zjistí jaký je poslední index čísla v arrayi.
    }
}
