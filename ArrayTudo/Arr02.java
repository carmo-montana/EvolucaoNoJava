package EvolucaoNoJava.ArrayTudo;

    // Uma vez que a nossa array já tem um tamanho especifico, não tem com mais 
    // adicionar mais elementos dentro da nossa matriz. Existe outras formas
    // de fazer isso, tecnicamente, não é sobre adicionar elementos na matriz existente,
    // mas criar outra matriz e juntar com a anterior. "ArrayList"
    // 1- CRIAR UM MATRIZ
    // 2- ADICIONAR ELEMENTO NA NOVO MATRIZ, JUNTO COM ANTERIOR. 

public class Arr02 {
    public static void main(String[] args) {
     
        String[] frutas = new String[] {"Banana", "Melancia", "Mamão"};
        String[] newFrutas = new String[frutas.length+2];

        for(int i = 0; i < frutas.length; i++) {
            newFrutas[i] = frutas[i];
        }

        newFrutas[newFrutas.length -2] = "Uva";
        newFrutas[newFrutas.length -1] = "Morango";

        for(String str: newFrutas) {
            System.out.println(str);
        }
    }
}
