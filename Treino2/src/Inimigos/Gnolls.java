package Inimigos;

public class Gnolls {
    private String raca;
    private String poder;

    public String getRaca() {
        return raca = "Gnoll";
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPoder() {
        return poder = "força bruta";
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
    public void exibirGnolls() {
        System.out.println("""
                =======================================
                Sou um humanoide, mas mais conhecido como 
                """ + raca + " e um dos meus pontes fortes é a minha " + poder
                );
    }
}
