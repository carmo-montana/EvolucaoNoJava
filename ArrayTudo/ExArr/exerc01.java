package EvolucaoNoJava.ArrayTudo.ExArr;

import java.util.ArrayList;
import java.util.Arrays;

// Crie uma array, adicione elementos na matriz e converta em uma 
// ArrayList, e adicione mais elemento na matriz. Por ultimo converta
// em array. 

public class exerc01 {
    public static void main(String[] args) {
        String[] nomes = new String[]{"Adriano", "Gabriel", "Andeson", "André"};
        ArrayList<String> novaList = new ArrayList<>(Arrays.asList(nomes));
        novaList.add("Della cruz");
        novaList.add("Rodinel");
        System.out.println(novaList);
        String[] tamanhoList = novaList.toArray(new String[novaList.size()]);
        System.out.println(tamanhoList);
        for(String str: tamanhoList) {
            System.out.println(str);
        }
    }
}
