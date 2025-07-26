package EvolucaoNoJava.ArrayTudo;

import java.util.ArrayList;

// Aprendendo a usar o  Método "clear". Serve para remover uma lista;

public class Arr07 {
    public static void main(String[] args) {
        ArrayList<String> listNome = new ArrayList<>();

        listNome.add("Marcaco");
        listNome.add("Leão");
        listNome.add("Chipanzé");
        listNome.sort(null);

        System.out.println("\nLista de nomes de animais: ");
        for(String str: listNome) {
            System.out.println(str);
        }

        System.out.println();

        listNome.sort((a,b) -> {return -1 * a.compareTo(b);});
        for(String str: listNome) {
            System.out.println(str);
        }

        System.out.println("\nLista de nomes de animais excluidos: ");

        listNome.clear();
        System.out.println(listNome);
    }
}
