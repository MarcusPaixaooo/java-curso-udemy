package Desafios;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual sua altura?");
        double altura = entrada.nextDouble();

        System.out.println("Qual o seu peso?");
        double peso = entrada.nextDouble();

        double IMC = peso / Math.pow(altura, 2);

        System.out.println("O seu imc é: " + Math.round(IMC));

        entrada.close();


    }
}
