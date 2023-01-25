package OutrosFundamentos;

import java.util.Scanner;

public class IgualdadeComStrings {

    public static void main(String[] args) {
        /*Trabalhar com equals
        * */
        System.out.println("2" == "2");
        String s1 = new String("2");
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next();
        System.out.println("2" == s2);
        System.out.println("2".equals(s2));
        System.out.println("2".equals(s2.trim()));
        //trim faz com que os espaços em branco sejam extintos na resposta.


        entrada.close();


    }
}
