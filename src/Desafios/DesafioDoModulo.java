package Desafios;

import java.util.Scanner;

public class DesafioDoModulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira primeiro número");
        double num1 = entrada.nextDouble();

        System.out.println("Insira segundo número");
        double num2 = entrada.nextDouble();
        String trava = entrada.nextLine();

        System.out.println("Informe a operação (+ - * / %)");
        String op = entrada.nextLine();

        // Lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("O resultado de %.2f %s %.2f = %.2f ", num1, op, num2, resultado);


    }
}
