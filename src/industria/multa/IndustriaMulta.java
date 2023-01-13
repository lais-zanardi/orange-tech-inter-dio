package industria.multa;

import java.util.Scanner;

public class IndustriaMulta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input > 60) {
            System.out.println("Foi multado");
        } else {
            System.out.println("Nao foi multado");
        }
    }
}
