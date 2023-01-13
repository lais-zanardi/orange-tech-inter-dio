package mesada.sobrinho;

import java.util.Scanner;

public class MesadaSobrinho {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            int mesada = 50;

            int totalMesada = mesada * input;

            System.out.println(totalMesada);

        }
}
