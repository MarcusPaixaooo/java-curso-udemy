package Fundamentos.Operadores;

public class OperadoresLogicos {

    /*
     OPERADORES LÓGICOS

        *Tabela verdade*


        && (E) -> Um falso é igual a falso

        ||(ou) -> Um dos dois precisa ser verdadeiro

        ^ (xor)-> Um ou outro. Os dois não podem dar o mesmo resultado;

        ! (not) -> Inverte o resultado (false -> true / true -> false)

        !! (not) -> Nega duas vezes, ou seja false !-(true)-!-> false;

    * */

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && !condicao2); //Pode por negação à frente de uma condição.
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        

    }
}
