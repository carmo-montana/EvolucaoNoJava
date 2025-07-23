package EvolucaoNoJava.ArrayTudo;
// Crie um matriz com uma lista de nome, e deixa em ordem alfabetica. 

import java.util.ArrayList;
import java.util.Arrays;

public class Arr05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("xuxa");
        list.add("Paula");
        list.add("Edson");
        list.add("Talyson");
        list.add("Beatriz");
        list.add("Alexandre");
        list.add("Jakson");
        list.add("Diego");
        list.add("Carlos");
        list.add("Kaike");
        list.add("Martheus");
        list.add("Naldo");
        list.add("Osvaldo");
        list.add("Sarah");
        list.add("Lucas");
        list.add("Fernado");
        list.add("Gabriela");
        list.add("Henrique");
        list.sort(null);
        for(String str: list) {
            System.out.println(str);
        }

        System.out.println();

        list.sort((a,b) -> {return -1 * a.compareTo(b);});
        for(String str: list) {
            System.out.println(str);
        }

        System.out.println();

        String[] names = new String[]{"Matheus", "Lucas", "Paulo", "Henrique", "Alason", "Beatriz"};

        for(String str: names) {
            System.out.println(str);
        }

        System.out.println();

        Arrays.sort(names);

        for(String str: names) {
            System.out.println(str);
        }

                
    }     
}
