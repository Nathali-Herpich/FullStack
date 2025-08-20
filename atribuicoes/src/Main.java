import br.com.biblioteca.Carro;

public class Main {
    public static void main(String[] args) {
        // Atribuições simples
        int idade = 25;
        String nome = "Maria";
        
        // Atribuição com expressões
        int a = 10;
        int b = 20;
        int soma = a + b;

        // Atribuição com operadores aritméticos
        int x = 5;
        x += 10; // x agora é 15

        // Atribuição de objetos
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "azul";


        // Exibindo os resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Soma: " + soma);
        System.out.println("Modelo do carro: " + meuCarro.modelo);


    }
}