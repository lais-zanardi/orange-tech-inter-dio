package lojinha.doces;

import java.util.Scanner;

public class LojinhaDoces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int qntDoces = input * 2;
        System.out.println("O cliente obteve " + qntDoces + " doces");
    }
}
