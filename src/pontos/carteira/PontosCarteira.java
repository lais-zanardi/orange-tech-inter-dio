package pontos.carteira;

import java.util.Scanner;

public class PontosCarteira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int velocidade = sc.nextInt();
        int qntMultas = sc.nextInt();

        if(velocidade>80) {
            qntMultas = qntMultas +1;
        } if(qntMultas > 2) {
            System.out.println(qntMultas + " multas. Levou pontos na carteira");
        } else
            System.out.println(qntMultas + " multas. Nao levou pontos na carteira");
    }
}
