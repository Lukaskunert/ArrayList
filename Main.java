package com.company;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        ArrayList numbers = new ArrayList();

        numbers.set(x, y);
        System.out.println("" + numbers.size()); // Zjistí počet čísel v arrayi.
        System.out.println("" + numbers.isEmpty()); // Zjistí jestli je arrray prázdný.
        System.out.println("" + numbers.indexOf(x)); // Zjistí pozici specifického čísla.
        System.out.println("" + numbers.get(x)); // Získá číslo.
        System.out.println("" + numbers.contains(x)); //Zjistí jestli seznam obsahuje specifické číslo.
        System.out.println("" + numbers.lastIndexOf(x)); //Zjistí jaký je poslední index čísla v arrayi.
    }
}
