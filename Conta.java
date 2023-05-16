public class  Conta{
    //ATRIBUTOS:
    //isso ainda não se tornou uma conta, é apenas uma especificação, com isso vamos criar VÁRIAS contas (OBJETO):
    double saldo;
    int agencia;
    int numero;
    String titular;
    //CLASSE > INSTÂNCIA > OBJETO

    public void deposita(double valor){
        //this: palavra chave que indica uma referencia para ESTE objetivo (NESTE CASO, CONTA DA NICOLE)
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
        }

    }
}
