package fundamentos;

import java.util.Scanner;

public class VariaveisEConstantes {
    public static void main(String[] args) {
        //Definindo circunferência de uma área.
        double raio = 3.4;
        //Utilizar constantes com letras maíusculas.
        final double PI = 3.14159;
        double area = PI * raio * raio;
        System.out.println(area);
    //Alteração no valor da variável.
        raio = 10;
        area = PI * raio * raio;
        System.out.println("Area = " + area + "m2");

    }
}