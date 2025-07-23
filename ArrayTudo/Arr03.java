package EvolucaoNoJava.ArrayTudo;

import java.util.ArrayList;
import java.util.Arrays;

// Faça um programa e  adicione elemento na matriz
// e convet the array to an ArrayList, e convert the ArrayList to an array.    

public class Arr03 {
    public static void main(String[] args) {
       
        String[] nome = new String[] {"Adriano", "Felipe", "Marcos", "Leandro"};
        ArrayList<String> newNome = new ArrayList<>(Arrays.asList(nome));

        newNome.add("Antonio");
        newNome.add("Luiz");
        newNome.add("Francisco");
        newNome.add("Jakson");

        String[] nomeList = newNome.toArray(new String[newNome.size()]);

        for(String str: nomeList) {
            System.out.println(str);
        }

    }
}
