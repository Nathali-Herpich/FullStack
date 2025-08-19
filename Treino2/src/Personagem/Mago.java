package Personagem;

public class Mago {
    private String name;
    private int idade;
    private String arma;

    public String getName() {
        return name = "Dumbleodor";
    }

    public int getIdade() {
        return idade = 115;
    }

    public String getArma() {
        return arma = "Livro de magia";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void exibirMago() {
        System.out.println("""
                ===================================
                Eu sou um poderoso mago do oeste! 
                Meus poderes são fora do alcance de todos.
                Me chamam de 
                """ + name +

                """
                        . Sou um mago centenário e,por isso, muitos me procuram 
                        para escutar meus ensinamentos. Possuo  
                         """ + idade + " anos." +
                "\nMeu "+ arma + """
                 é um grande amigo em batalhas sangrentas.
                 =======================================
                """
        );
    }
}
