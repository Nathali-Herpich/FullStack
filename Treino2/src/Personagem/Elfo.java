package Personagem;

public class Elfo {
    private String raca;
    private String name;
    private int idade;

    public String getRaca() {
        return raca = "altaneiros";
    }

    public String getName() {
        return name = "Legolas";
    }

    public int getIdade () {
        return idade = 230;
    }

    public void exibir() {
        System.out.println("==================================\nOlá, eu sou " + name + ", tenho " + idade + " anos " + "e pertenço a raça " + raca+"\n ===========================");
    }
}
