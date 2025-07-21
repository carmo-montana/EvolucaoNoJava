package EvolucaoNoJava.ArrayTudo;

// Declaração de matriz cadeia de caracteres;
// Especificando o tamanho da matriz. 




public class Arr01 {
    public static void main(String[] args) {

        String[] listNome = new String[5];
        listNome[0] = "Alexandre";
        listNome[1] = "Fábio";
        listNome[2] = "André";
        listNome[3] = "Lucas";
        listNome[4] = "Fernando";

        // Imprimindo apenas um índice. 
        System.out.println(listNome[0]);

        System.out.println("***********************************");

        // Como imprir todos os meus índice da array, com foreach. 
        for(String str: listNome) {
            System.out.println(str + " ");
        }

        System.out.println("*************************************");

        // Imprimindo com for tradicional, a minha lista;
        for(int i = 0; i < listNome.length; i++) {
            System.out.println("listNome ["+i+"]: "+ listNome[i]);
        }

    }
}
