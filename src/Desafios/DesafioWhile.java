package Desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0; // cada nota contabilizada vai sendo contada.
        double nota = 0;
        double total = 0;

        while (nota != -1){
            System.out.println("Informe a nota");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {

                total += nota;
                quantidadeDeNotas++;
            }

        }
//calcular a média

        double media = total / quantidadeDeNotas;
        System.out.println("Média = " + media);
        System.out.println(quantidadeDeNotas);
    }
}
