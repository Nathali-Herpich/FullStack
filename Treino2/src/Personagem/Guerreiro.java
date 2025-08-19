package Personagem;

public class Guerreiro {
    private String name;
    private int idade;
    private String arma;


    public String getName() {
        return name = "Einar";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade = 300;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getArma() {
        return arma = "machado de ouro";
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void exibirGuerreiro() {
        System.out.println("""
                ============================
                Sou um forte guerreiro do leste.
                Com minha força gigantesca, esmago meus inimigos.
                Meu nome?
                Me chamo\n  """
                + name + ",caro viajante. " + "Tenho " + idade + " anos." +
                " E possuo um esbelto " + arma + " para me auxiliar em batalhas" );
    }
}
