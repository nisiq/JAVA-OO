Array = Array Elements + Array Indexes
Um array no Java pode ser feito de apenas uma tipagem

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] meuArray = new int[5];
        System.out.println(Arrays.toString(meuArray));
    //array de 1 a 5
        meuArray[0]=1;
        meuArray[1]=2;
        meuArray[2]=3;
        meuArray[3]=4;
        meuArray[4]=5;
        System.out.println(Arrays.toString(meuArray));
        Arrays.fill(meuArray, 10);
        System.out.println(Arrays.toString(meuArray));

        //SIMPLIFICANDO COM FOR (array de 1 a 5):
        for (int i = 0; i <5; i++){
            meuArray[i]=i+1;
        }
        System.out.println(Arrays.toString(meuArray));

        int [] meuArray = {1, 2, 3, 4, 5};
        meuArray[4]= 0;
        System.out.println(Arrays.toString(meuArray));
        for (int i =0; i< meuArray.length; i++){
            System.out.println(meuArray[i]);*/
//FOR IT
        double[] notas = {5.0, 4.0, 3.0, 6.0, 8.0};
        for(double nota: notas){
            System.out.println(nota);
        }
        }
    }
