package fundamentos;

public class conversaoTiposPrimitivosNumerico {
    public static void main(String[] args) {
     /*Um inteiro menor para um maior = conversão implícita*/
        /*Conversão de um maior para um menor = Conversão explícita (cast)*/

        double a = 1; // Conversão implícita
        System.out.println(a);

        float b = (float) 1.0;// Conversão para explicita para float (melhor por o f atrás do número)
        System.out.println(b);

        int c = 138;
        byte d = (byte) c; //Explícita (cast)
        System.out.println(d);

double e = 1.9999;
int f = (int) e; // cast
        System.out.println(f);

    }
}
