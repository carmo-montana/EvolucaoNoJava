public class Main {
    public static void main(String[] args) {
        String text = "Java é a melhor linguagem de programaçao para aprender";
        
        System.out.println("Texto original: " + text);
        System.out.println("Texto maiúsculo: " + text.toUpperCase());
        System.out.println("Tamanho do texto: " + text.length());
        System.out.println("Tem a palavra java: " + text.contains("Java"));

        System.out.println("----------------------------------------------------------------");
        
        double numero = -8.6;
        System.out.println("Absoluto: " + Math.abs(numero));
        System.out.println("Redonda para cima: " + Math.ceil(numero));
        System.out.println("Raiz quadrada de 16: " + Math.sqrt(16));

        System.out.println("-----------------------------------------------------------------");

        Pessoa p = new Pessoa();
        p.nome = "Felipe de oliveira andrade";
        p.idade = 34;
        p.funcao = "Typescript, javascript, java, lisp, perl, clojure";

        p.apresetacao();

        System.out.println("------------------------------------------------------------------");
        
        Carro carr = new Carro();
        carr.modelo = "Civis";
        carr.ano = 2020;

        carr.carro();

        System.out.println("-------------------------------------------------------------------");

        Calculadora cal = new Calculadora();
        System.out.println("5 + 8 = " + cal.somar(5, 8));
        System.out.println("46 * 23 = " + cal.multiplicar(46, 23));
    }
}