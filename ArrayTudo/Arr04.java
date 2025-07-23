package EvolucaoNoJava.ArrayTudo;

import java.util.ArrayList;

// Utilizando métodos do ArrayLIst "add", serve para adicionar. 
// e o "addAll" é para adicionar os elementos no só lugar. 

public class Arr04 {
   public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    list.add("Lapis");
    list.add("Caderno");
    list.add("Caneta");

    ArrayList<String> newList = new ArrayList<>();

    newList.add("Livro");
    newList.addAll(1, list);

    // Isso no addAll(1, list) é para adicionar na posição especifica;

    System.out.println(newList);

   }
}
