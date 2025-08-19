package Inimigos;

public class Espectros {
    private String raca;
    private String caracteristica;

    public String getRaca() {
        return raca = "Espectro";
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCaracteristica() {
        return caracteristica = "Assustador";
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }


    public void exibirEspectro() {
        System.out.println("""
    =============================
    Sou um 
    """
                + raca +
     " e meus inimigos conhecem por eu ser extremamente " + caracteristica);
    }
}
