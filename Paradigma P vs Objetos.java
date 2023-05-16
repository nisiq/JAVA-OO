/*No projeto OO os atributos e comportamentos estão contidos dentro de um único objeto,
 ao passo que no projeto procedural
 ou estruturado, os atributos e comportamentos estão normalmente separados.


Dados e comportamento vão andar juntos.



Caracteristicas de uma classe = Atributo
na criação de uma instância não precisamos
preencher os atributos se não quisermos

Quando constrói um objeto, todos seus valores são 0/false

/*Criação de um banco (dados)
    CONTA (ESPECIFICAÇÃO):
          saldo,
          agência,
          número,
          conta
         >>>>>>> CONSTRUIR várias CONTAS
    COMPORTAMENTOS:
          saca,
          deposita,
          transfere

 4 ATRIBUTOS E 3 COMPORTAMENTOS = TRANSFORMAR = METODOS
 METODOS = DESCREVER MANEIRAS DE FAZER ALGUMA COISA
            PARECIDO COM FUNÇÃO
            Um método define o comportamento ou a maneira de fazer algo.
            nomeDaReferencia.nomeDoMetodo();


 definimos o retorno (nesse caso void), definimos o nome do método (nesse caso deposita)
  e definimos corretamente os parâmetros (nesse casos dois, double valor e int numero

  Usamos o this dentro de um método para acessar um atributo:

class Conta {

        double saldo;
        int numero;

        void deposita(double valor) {
            this.saldo = this.saldo + valor;
        }
}
 */





