package Inimigos;

public class Hobgoblis {
    private String raca;
    private String caracteristica;

    public String getRaca() {
        return raca = "Hobgoblin";
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCaracteristica() {
        return caracteristica = "tirano";
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void exibirHobGoblin() {
        System.out.println("""
                =================
                Sou um 
                """ + raca + "E sou conhecido por meus inimigos por ser extremamente " + caracteristica);
    }
}
