package leitura.gertrudes;

import java.util.Scanner;

public class LeituraGertrudes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int tempo = input/3;

        System.out.println(tempo);
    }
}
