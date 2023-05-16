public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: "+ segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo atual da segunda conta: "+segundaConta.saldo);

        System.out.println("saldoooo: " + primeiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("sao as mesmas");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
