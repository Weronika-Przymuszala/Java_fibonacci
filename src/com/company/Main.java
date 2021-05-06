package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        Scanner liczba = new Scanner(System.in);
        int x = liczba.nextInt();
        int z = 1;
        int y = 1;
        int wynik = 0;
        if (x > 1) {
            for (int i = 3; i <= x; i++) {
                wynik = y + z;
                y = z;
                z = wynik;
            }
            System.out.println("Wynik to: " + wynik);
        } else {
            wynik = 1;
            System.out.println("Wynik to: " + wynik);
        }
    }
}
