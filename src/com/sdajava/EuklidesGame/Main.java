package com.sdajava.EuklidesGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int coin1, coin2;

        System.out.println("Witamy w grze!!!\n");

        System.out.println("Podaj liczbe żetonów pierwszego gracza: ");
        Scanner P1 = new Scanner(System.in);
        coin1 = P1.nextInt();

        System.out.println("Podaj liczbe żetonów drugiego gracza: ");
        Scanner P2 = new Scanner(System.in);
        coin2 = P2.nextInt();

        while (coin1 != coin2) {

            if (coin1 > coin2) {
                coin1 = coin1 - coin2;
                System.out.println(coin1 + ", " + coin2);
            }
            if (coin2 > coin1) {
                coin2 = coin2 - coin1;
                System.out.println(coin1 + ", " + coin2);
            }
        }
        System.out.println("Końcowa wartośc: " + coin1 + ". Jest po równo!!!");
    }


}

