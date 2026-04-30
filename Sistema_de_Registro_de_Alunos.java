public class Sistema_de_Registro_de_Alunos {
    String Nome;
    Integer Matricula;
    double Notafinal;

    static void vericarsituacao(double Notafinal) {
        if (Notafinal > 7.0) {
            System.out.println("aprovado");
        }
        if (Notafinal < 7.0) {
            System.out.println("reprovado");
        }
    }

    public static void main(String[] args) {
        vericarsituacao(10);
        vericarsituacao(6);
        vericarsituacao(1);
    }

}
