import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();
        Usuario u1 = new Usuario("João", 16);
        listaDeUsuarios.add(u1);
        listaDeUsuarios.add(new Usuario("Maria", 17));
        listaDeUsuarios.add(new Usuario("José", 18));
        listaDeUsuarios.add(new Usuario("Pedro", 20));

        System.out.println(listaDeUsuarios); //Endereço de memória (lista de objetos)

        for (Usuario usuario: listaDeUsuarios){
            System.out.println(usuario.nome);
        }
        String listadeNomes = null;
        for(Usuario usuario:listaDeUsuarios){
            listadeNomes= listadeNomes.concat(" "+usuario.nome);
        }
        System.out.println(listadeNomes);
        }
        }
