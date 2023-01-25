package Desafios;

import java.util.Scanner;

public class SimENao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Você fez isso?");

        String resposta = entrada.nextLine();
        if ("Sim".equalsIgnoreCase(resposta)) {
            System.out.println("Então pode seguir em frente.");

        } else if ("Não".equalsIgnoreCase(resposta)) {
            System.out.println("Poxa, parece que você tem que refazer então.");

        }
        entrada.close();
    }
}
