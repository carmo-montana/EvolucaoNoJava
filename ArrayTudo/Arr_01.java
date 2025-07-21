package EvolucaoNoJava.ArrayTudo;

import java.util.Scanner;

// Declaração de matriz cadeia de caracteres;
// Especificando o tamanho da matriz.

public class Arr_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho da sua lista de nomes: ");
        int tamanho = scan.nextInt();
        scan.nextLine();

        String[] names = new String[tamanho];

        System.out.println("\nDigite o nome: ");
        for(int i = 0; i < names.length; i++) {
            System.out.print("NOME "+(i + 1)+":");
            names[i] = scan.nextLine();
        }

        System.out.println("\nNomes armazenados: ");
        for(String nome: names) {
            System.out.println(nome);
        }

        scan.close();
    }
       
}