/*Aula se tratou de formas de impressão em tela e requisição de
* dados ao usuário a partir do system.in (entrada)*/

package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia");
        System.out.println("\nBom");
        System.out.println("Dia");

        System.out.printf("Megasena %d %d %d %d", 1, 2, 3, 4);
        /*Print formatado - Melhor forma de se imprimir concatenações grandes*/

        System.out.printf("\nSalário %.1f", 1234.1234);
        /*%.1f arregdonda valor para uma casa decimal flutuante*/
        System.out.printf("\nNOme: %s", "João");

        Scanner entrada = new Scanner(System.in);
        System.out.println("\nEscreva uma entrada");
        String nome = entrada.nextLine();

        System.out.println("Sobrenome");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("Nome: %s %s. Idade: %d  ", nome, sobrenome, idade);

        entrada.close();
    }
}
