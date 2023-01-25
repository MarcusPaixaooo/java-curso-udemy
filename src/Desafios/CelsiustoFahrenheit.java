package Desafios;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos graus em Celsius?");
        double celsius = entrada.nextDouble();

        double conversaoParaFahrenheit = (celsius * 9.0/5.0) + 32;

        System.out.println("O resultado é: " + conversaoParaFahrenheit);

        entrada.close();
    }
}
