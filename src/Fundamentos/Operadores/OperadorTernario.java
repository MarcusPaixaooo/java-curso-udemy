package Fundamentos.Operadores;
/*
Bom para passar resultados visuais ao usuário

String variável = condição ? "resultado true" : "resultado false";
* */
public class OperadorTernario {

    public static void main(String[] args) {
        double media = 4;
        String resultado = media >= 7 ? "Aprovado": "Reprovado";
        System.out.println(resultado);

    }

}
