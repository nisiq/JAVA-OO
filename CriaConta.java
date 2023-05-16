public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); // <<< INSTÂNCIA/CRIA OBJETO DO TIPO CONTA
        primeiraConta.saldo = 200; //estou falando que o saldo da PRIMEIRA conta é 200. ATRIBUI VALOR

        primeiraConta.saldo += 100;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("primenta conta tem: R$" + primeiraConta.saldo);
        System.out.println("segunda conta tem: R$" + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);

        if(primeiraConta == segundaConta) {
            System.out.println("memsa ocnta");
        } else {
            System.out.println("contas diferentes");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
