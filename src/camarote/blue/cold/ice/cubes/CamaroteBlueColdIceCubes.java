package camarote.blue.cold.ice.cubes;

import java.util.Scanner;

public class CamaroteBlueColdIceCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int numeroCamarote = (input/2)  + (input%2);

        System.out.println(numeroCamarote + " pessoas no camarote");
    }
}
