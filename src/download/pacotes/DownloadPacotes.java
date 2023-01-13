package download.pacotes;

import java.util.Scanner;

public class DownloadPacotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i=0; i<input; i++) {
            System.out.print("/");
        }
    }
}
