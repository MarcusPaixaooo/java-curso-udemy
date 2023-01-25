package Desafios;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor em Fahrenheit? ");
        double entradaFahrenheit = entrada.nextDouble();

        double conversaoParaCelsius = (entradaFahrenheit - 32) * 5.0 / 9.0;

        System.out.println("A conversão de Fahrenheit para Celsius é: " + conversaoParaCelsius);

        entrada.close();
    }
}
