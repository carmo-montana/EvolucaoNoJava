package EvolucaoNoJava.ArrayTudo.ExArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// Faça um programa que ler alguns números 
// e informe se é Par ou Impar. 


public class ExercParOuImpar01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int tamanho = solicitarValor("Informo o tamanho da matriz: ", scan);

        int[] num = new int[tamanho];
        for(int i = 0; i < tamanho; i++) {
            num[i] = solicitarValor("Digite o "+(i + 1)+" valor: ", scan);
        }

        
        int[][] resultado = ParOuImpar(num);
        System.out.println("Números Par "+ Arrays.toString(resultado[0]));
        System.out.println("Números Impar"+ Arrays.toString(resultado[1]));
        
        // Aqui no metodo Arrays.toString(resutado[]), não transforma 
        // a matriz bidimensional para uma String, apenas mostra os 
        // elementos como texto. Por exemplo se o resultado[0] for
        // [2, 4, 7], o Arrays.toString(resultado[0]) retorna String. "[2, 4, 7]" 

        scan.close();
    }    

    public static int solicitarValor(String message, Scanner scan) {
        int valor; 
        while(true) {
            System.out.println(message);
            String entrada = scan.nextLine().trim();

            if(entrada.isEmpty()) {
                System.out.println("Entrada inválida. Digite apenas números inteiros.");
                continue;
            }

            try {
                valor = Integer.parseInt(entrada);
                if(valor > 0) {
                    return valor;
                } else {
                    System.out.println("Entrade inválida. Digite apenas números interos positivos.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite apenas números positos.");
            }
        }
    }

    public static int[][] ParOuImpar(int[] num) {
      List<Integer> pares = new ArrayList<>();
      List<Integer> impares = new ArrayList<>();

      for(int str: num) {
        if(str % 2 == 0) {
            pares.add(str);
        } else {
            impares.add(str);
        }
      }

      Collections.sort(pares);
      Collections.sort(impares);

      return new int[][] {
        pares.stream().mapToInt(i -> i).toArray(),
        impares.stream().mapToInt(i -> i).toArray()
      };
    }
}
