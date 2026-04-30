public class Simulador_de_Conta_Bancária {
    String titulo;
    double saldo;
    double limite_especial;

    // vai depositor o valor no saldo. usando o this.saldo ele salva o valor no saldo.
    void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("deposito bem sucedido");
        }
    }

    //esse metodo é pra sacar. vai pegar o valor do saque e ver se tem saldo o suficiente junto com o credito especial para ai sim realizar o saque
    void sacar(double valor) {
        if (valor <= this.saldo + this.limite_especial) {
            this.saldo -= valor;
            System.out.println("saque realizado");
        } else {
            System.out.println("saldo insuficiente");
        }
    }

    void versaldo() {
        System.out.println("seu saldo é: " + saldo);
    }

    void algo(double saldo) {
        this.saldo += saldo;
    }
    //o valor do saque no zero para so quando depositar ter algo. e o limite de credito no 500 mas tambem pode botar outras quantidades. depois e so chaamr as funçoes e colocar os valores.
    public static void main(String[] args) {
        Simulador_de_Conta_Bancária conta = new Simulador_de_Conta_Bancária();
        conta.saldo = 0;
        conta.limite_especial = 500;

        conta.depositar(200);
        conta.versaldo();
        conta.sacar(200);
        conta.versaldo();
    }
}

