package EvolucaoNoJava.ArrayTudo;

// Aprendendo a utilizar o metodo "clone". Esse metodo faz
// uma copia de uma lista.

import java.util.ArrayList;

public class Arr08 {
    public static void main(String[] args) {
        ArrayList<String>  list = new ArrayList<>();

        list.add("Ford");
        list.add("Fiat");

        System.out.println(list);

        ArrayList lists = (ArrayList)list.clone();

        System.out.println(lists);
    }    
}
