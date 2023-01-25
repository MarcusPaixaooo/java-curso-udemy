package fundamentos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        /*Wrapper é a versão objeto dos tipos primitivos*/
        // byte
        Byte b = 100;
        //short
        Short s = 1000;
        //int
        Integer i = 10000;
        //long
        Long l = 100000L;
        //float
        Float f = 123.10F;
        //double
        Double d = 1234.5678;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        // boolean
        Boolean bo = Boolean.parseBoolean("true"); // Converte para valor boolean
        System.out.println(bo.toString().toUpperCase()); // Conversão para String

        //char
        Character c = 'c';
        System.out.println(c + "...");
        System.out.println(c.toString());//Conversão para string


    }
}
