package salvando.musicas;

import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(input.contains(".mp3"))
            System.out.println("Salvar");
         else
            System.out.println("Deletar");

    }
}
