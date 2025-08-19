package Inimigos;

public class Mumias {
    private String raca;
    private String poder;

    public String getRaca() {
        return raca = "Múmia";
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPoder() {
        return poder = "Causar doenças mortais";
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void exibirMumia() {
        System.out.println("""
               ========================================
                Possuo milhões de escravos ao meu dispor.
                O que eu sou? 
                Sou uma poderosa
                """ + raca + " e ataco meus inimigos de uma maneira cruel e sem piedade. Eu posso " + poder + " deixando sequelas irreversíveis");
    }
}
