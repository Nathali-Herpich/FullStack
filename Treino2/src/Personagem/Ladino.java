package Personagem;

public class Ladino {
    private String name;
    private int idade;
    private String caracteristica;

    public String getName() {
        return name = "Jesper";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade = 18;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCaracteristica() {
        return caracteristica = "Ágil";
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void exibirLadino() {
        System.out.println("""
                Sou um misterioso ladino do norte.
                Muitos não me conhecem pelo nome, mas sou conhecido por muitos feitos.
                Meu nome é um mistério,como dito antes, mas apenas você, caro jogador, irá me conhecer.
                Meu nome é 
                """ + name +
                ".\nTenho apenas " + idade + " anos" + " e sou incrivelmente " + caracteristica

        );
    }
}
