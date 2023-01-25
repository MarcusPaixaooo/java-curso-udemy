package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
   //Usar o Scanner
   //3 strings next line com 3 salários
   //calcular a média dos 3 salários
    //separar as casas decimais com vírgula
    // Converter a String em um valor numérico com a flexibilidade da vírgula.
   public static void main(String[] args) {
       Locale.setDefault(new Locale("pt", "BR"));

       Scanner teclado = new Scanner(System.in);

       System.out.println("Numero");
       double num1 = teclado.nextDouble();

       System.out.println(num1);

   }

}
