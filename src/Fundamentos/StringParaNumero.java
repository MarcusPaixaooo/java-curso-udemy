package fundamentos;

import javax.swing.*;
import java.math.BigDecimal;

public class StringParaNumero {
    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite o primeito número.");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor.");

        double numero1 =  Double.parseDouble(valor1);
        double numero2 =  Double.parseDouble(valor2);

        double soma =  numero1 + numero2;


        System.out.println("Soma é: " + (int) soma);
        System.out.println("A média é " + soma / 2);

        //BigDecimal //Médoto de Math para deixar os números precisos


    }
}
