package Personagem;

public class Barbara {
    public String name;
    public int idade;

    // O void é usada para indicar que um método que
    //   não retorna nenhum valor.
    //   Ou seja, o método executa uma ação,
    //    mas não produz um resultado que possa ser usado em outras partes do código.

    public void exibir() {
        System.out.println("O seu nome é " + name + " e sua idade é " + idade);
    }
}
