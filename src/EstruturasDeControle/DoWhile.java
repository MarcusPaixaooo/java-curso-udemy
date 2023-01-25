package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        //do {Executa primeiro e depois vem o while} while (bloco de código ou execução)
        //Ao menos uma vez o do while é executado

        //template - Guarda blocos de códigos para depois serem executados com palavra chave

        Scanner entrada = new Scanner(System.in);
        String texto = "";
        do {
            System.out.println("Você precisa falar " +
                    "as palavras mágicas");
            System.out.print("Quer sair? ");
            texto = entrada.nextLine();


        }while(!texto.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigado");
        entrada.close();

    }
}
