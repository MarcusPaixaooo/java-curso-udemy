package Fundamentos.Operadores;
/*
Fundamentos.Operadores Unários

a++ - Pós incremento
++a - Pré incremento
a-- - Pós decremento
--a - Pré decremento

* */
public class OperadoresUnarios {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a + 1
        a--; // a - 1

        ++b; // b + 1
        --b; // b - 1

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio");
        System.out.println( ++a == b--);
        System.out.println(a);
        System.out.println(b);
    }


}
