package Personagem;

public class Arqueiro {
    String name;
    int idade;
    String arma;


    public String getName() {
        return name = "Apollo";
    }

    public int getIdade() {
        return idade = 30000;
    }

    public String getArma() {
        return arma = "Arco e flecha";
    }

    public void exibirArqueiro() {
        System.out.println("Eu sou o " + name + ", tenho " + idade + " anos" + " possuo um arco e flecha como arma");
    }
}
