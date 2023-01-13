package dc.monalds;

import java.util.Scanner;

public class DcMonalds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String lanche[] = new String[3];

        lanche = input.split(";");



        System.out.println(lanche[0] +
                "\n" + lanche[1] +
                "\n" + lanche[2] +
                "\n" + lanche[3]
        );
    }
}
