package EstruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {

public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String palavraMagica = "";

       while(!palavraMagica.equalsIgnoreCase("sim")){
           System.out.println("Qual a palavra mágica?");
           palavraMagica = entrada.next();
       }
       entrada.close();
    }
}
