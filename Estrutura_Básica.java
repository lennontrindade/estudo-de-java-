public class Estrutura_Básica {
    int começo;

    public void somar(int numero) {
        for (numero = começo; numero >= 0; numero++) {
            if (numero <= 10) {
                System.out.println(numero);
            }
        }
    }
    public static void main(String[] args) {
        Estrutura_Básica primeiro_numero = new Estrutura_Básica();
        primeiro_numero.começo = 0;

        primeiro_numero.somar(0);
    }
 }