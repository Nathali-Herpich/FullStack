package Inimigos;

public class Orcs {
    private String raca;
    private String caracteristica;

    public String getRaca() {
        return raca = "Orc";
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCaracteristica() {
        return caracteristica = "maléfico";
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void exibirOrcs() {
        System.out.println("""
              Sou um poderoso e gigantesco
                """ + raca +
                """
                  . Sou extremamente 
                        """ + caracteristica);
    }
}
