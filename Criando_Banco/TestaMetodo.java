import java.security.cert.CertPath;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDaNicole = new Conta();
        contaDaNicole.saldo = 100;
        //invocar metodo = usamos o parentese
        contaDaNicole.deposita(50);
        System.out.println(contaDaNicole.saldo);

        boolean conseguiuRetirar = contaDaNicole.saca(20);
        System.out.println(contaDaNicole.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaGabi = new Conta();
        contaDaGabi.deposita(1000);

        contaDaGabi.transfere(300, contaDaNicole);
        }
    }
