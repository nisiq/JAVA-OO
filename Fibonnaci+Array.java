import java.util.Arrays;
import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos termos em Fibonnaci você quer calcular? ");
        int qTermos = sc.nextInt();

        int termo1 = 0;
        int termo2 = 1;
        int[]termos = new int[qTermos];
        termos[0] = 0;
        termos[1] = 1;

        for (int i = 2;i < qTermos; i++){
            int t3 = termo1 + termo2;
            termo1 = termo2;
            termo2 = t3;
            termos[i] = t3;
        }
        System.out.println(Arrays.toString(termos));;

    }}
