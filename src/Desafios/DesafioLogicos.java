package Desafios;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

       String comprouTV50 = condicao1 && condicao2? "Foi ao Shopping, tomou e comprou a tv": "";
       String comprouTV30 = condicao1 ^ condicao2? "Comprou a tv": "";
       String comprouTVeSorvete= condicao1 || condicao2? "Comprou a tv, e tomou um  sorvete": "";

        System.out.println(comprouTV50);
        System.out.println(comprouTV30);
        System.out.println(comprouTVeSorvete);


    }




}
