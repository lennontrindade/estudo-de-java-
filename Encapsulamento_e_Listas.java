import java.util.ArrayList;

public class Encapsulamento_e_Listas {
    private String nome;
    private int preço;
    private int quantidade;
    int calculo;

    public String pegarnome() {
        return nome;
    }

    public void prencher(String n, int p, int q) {
        this.nome = n;
        this.preço = p;
        this.quantidade = q;
    }

    public int calculoTotal() {
        return preço * quantidade;

    }
    public static void main(String[] args) {
        Encapsulamento_e_Listas p1 = new Encapsulamento_e_Listas();
        Encapsulamento_e_Listas p2 = new Encapsulamento_e_Listas();
        Encapsulamento_e_Listas p3 = new Encapsulamento_e_Listas();
        Encapsulamento_e_Listas p4 = new Encapsulamento_e_Listas();
        ArrayList<Encapsulamento_e_Listas> produtoList = new ArrayList<>();
        p1.prencher("uva", 10, 300);
        p2.prencher("maça", 2, 1000);
        p3.prencher("abacaxi", 8, 500);
        p4.prencher("laranja", 6, 1500);
        produtoList.add(p1);
        produtoList.add(p2);
        produtoList.add(p3);
        produtoList.add(p4);

        for (Encapsulamento_e_Listas list : produtoList) {
            System.out.println("produto: " + list.pegarnome() + " soma total do protudo: " + list.calculoTotal());
        };
        //System.out.println(p1.pegarnome());
        //System.out.println(p1.calculos());
        //System.out.println(produtoList.get(0));

    }
}
