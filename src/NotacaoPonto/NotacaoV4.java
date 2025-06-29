// Crie uma String e use a notação de ponto para:
// Imprimir em minúsculo
// Mostrar o número de caracteres
// Ver se ela contém a palavra “Java” 

public class NotacaoV4 {
    public static void main(String[] args) {
        String texto = "Java é a melhor linguagem de programação.";

        System.out.println(texto.toUpperCase());
        System.out.println(texto.length());
        System.out.println(texto.contains("Java"));
    } 
}