package imoveis.disponiveis;

import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String informacoesImoveis[] = new String[3];

        informacoesImoveis = input.split("/");



        System.out.println("Imovel: " + informacoesImoveis[0] +
                " R$" + informacoesImoveis[1] +
                " " + informacoesImoveis[2]);
    }
}
