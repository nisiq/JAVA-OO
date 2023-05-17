public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preço = 4449.89;
        p1.desconto = 0.10;

        Produto p2 = new Produto();
        p2.nome = "Shampoo";
        p2.preço = 32.99;
        p2.desconto = 0.5;


        System.out.println(p1.nome);
        System.out.println(p1.preço);
        System.out.println(p1.desconto);
        System.out.println("-----------");
        System.out.println(p2.nome);
        System.out.println(p2.preço);
        System.out.println(p2.desconto);


    }
}

  public class Produto {
      String nome;
      double preço;
      double desconto;
  }
