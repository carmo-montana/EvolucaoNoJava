package EvolucaoNoJava.ArrayTudo;

import java.util.Scanner;

// Faça um programa que defina o tamanho de uma array em string,
//  e depois preenchê-lo com nomes. 

public class Arr_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho da array: ");
        int tamanho = scan.nextInt();
        scan.nextLine();

        String[] list = new String[tamanho];

        System.out.println("*******************************");

        System.out.println("\nDigite o nome: ");
        for(int i = 0; i < list.length; i++) {
            System.out.print("Digite "+ (i + 1)+": ");
            list[i] = scan.nextLine();
        }

        System.out.println("\n**********************************");

        System.out.println("\nNome armazenado: ");
        for(String str: list) {
            System.out.println(str + " ");
        }

        scan.close();
    }
}