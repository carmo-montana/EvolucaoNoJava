package EvolucaoNoJava.ArrayTudo.ExArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Faça um programa que ler alguns números 
// e informe se é Par ou Impar. 

public class ExerciParOuImpar02 {

    /**
     * Recebe os vetores Integer e transform a matriz em int
     * resultado[0] -> int[]
     * resultado[1] -> int[]
     * @param num
     * @return
     */

    public static int[][] ParOuImpar(int[] num) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for(int str : num) {
            if(str%2==0) {
                pares.add(str);
            } else {
                impares.add(str);
            }
        }

        // Converte uma lista para int[] usando Steam API;
        int[] vetoresPares = pares.stream().mapToInt(Integer:: intValue).toArray();
        int[] vetoresImpares = impares.stream().mapToInt(Integer:: intValue).toArray();

        // Agrupe tudo em uma matriz bidimensional e retorn;
        return new int[][] {vetoresPares, vetoresImpares};
    }

    public static void main(String[] args) {
        int[] resul = new int[] {
            1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
        };

        int[][] entrada = ParOuImpar(resul);
        System.out.println("Pares : "+ Arrays.toString(entrada[0]));
        System.out.println("Impares: "+ Arrays.toString(entrada[1]));

    }
}
