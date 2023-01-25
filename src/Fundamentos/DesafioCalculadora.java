package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //Ler de algum local o primeiro número.
        Scanner teclado = new Scanner(System.in);
        Double num1, num2, resultado;
        String operacao;

        System.out.println("Digite o primeiro número: ");
        num1 = teclado.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = teclado.nextDouble();

        System.out.println("Qual é a operação a ser feita?");
        operacao = teclado.next();

        resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;

        System.out.println(resultado);

    }
}
