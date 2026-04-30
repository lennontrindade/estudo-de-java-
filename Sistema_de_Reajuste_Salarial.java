public class Sistema_de_Reajuste_Salarial {
    String funcionario;
    double salario;
    double aumento;
    double calculo;
    int acimade10k;

    public static void main(String[] args) {
        Sistema_de_Reajuste_Salarial salario_funcionario = new Sistema_de_Reajuste_Salarial();
        Sistema_de_Reajuste_Salarial salario_funcionario2 = new Sistema_de_Reajuste_Salarial();
        Sistema_de_Reajuste_Salarial aumento_salarioA = new Sistema_de_Reajuste_Salarial();
        Sistema_de_Reajuste_Salarial aumento_salarioB = new Sistema_de_Reajuste_Salarial();
        Sistema_de_Reajuste_Salarial aumento_salarioC = new Sistema_de_Reajuste_Salarial();
        Sistema_de_Reajuste_Salarial calculo_aumento_salarioA = new Sistema_de_Reajuste_Salarial();
        Sistema_de_Reajuste_Salarial calculo_aumento_salarioB = new Sistema_de_Reajuste_Salarial();
        Sistema_de_Reajuste_Salarial calculo_aumento_salarioC = new Sistema_de_Reajuste_Salarial();
        aumento_salarioA.aumento = 10;
        aumento_salarioB.aumento = 15;
        aumento_salarioC.aumento = 20;
        salario_funcionario.salario = 1500;
        salario_funcionario2.acimade10k = 10000;
        calculo_aumento_salarioA.calculo = (salario_funcionario.salario * aumento_salarioA.aumento) / 100 + salario_funcionario.salario;
        calculo_aumento_salarioB.calculo = (salario_funcionario.salario * aumento_salarioB.aumento) / 100 + salario_funcionario.salario; 
        calculo_aumento_salarioC.calculo = (salario_funcionario.salario * aumento_salarioC.aumento) / 100 + salario_funcionario.salario;
        if (salario_funcionario2.acimade10k == 10000) {
            System.out.println("funcionário entrará na faixa de tributação máxima");
        }
        System.out.println(calculo_aumento_salarioA.calculo);
        System.out.println(calculo_aumento_salarioB.calculo);
        System.out.println(calculo_aumento_salarioC.calculo);

    }
    
}
