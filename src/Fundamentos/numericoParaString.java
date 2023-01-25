package fundamentos;

public class numericoParaString {
    public static void main(String[] args) {
        /*Conversão de número para String*/

        Integer num1 = 10000;
        System.out.println(num1.toString().length()); //Conversão para String

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length()); // Convertentdo no console

        System.out.println(("" + num2).length()); //Conversão através de concatenação

    }
}
