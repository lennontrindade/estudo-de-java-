public class Conversor_de_Moedas_Corporativo {
    float real;

    static void conversor(double dolar) {
        Conversor_de_Moedas_Corporativo dolar_nota = new Conversor_de_Moedas_Corporativo();
        dolar_nota.real = 5f;
        System.out.println("deu " + dolar * dolar_nota.real + " reais");
    }

    public static void main(String[] args) {
        //o resultado sera á conversao de dolar pra real
        conversor(5);
        conversor(10);
        
    }
}
