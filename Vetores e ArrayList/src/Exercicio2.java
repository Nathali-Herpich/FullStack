import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Beatriz");

        String nomeRemover = "Carlos";

        if (nomes.contains(nomeRemover)) {
            nomes.remove(nomeRemover);
        }

        System.out.println("Nomes atualizados: " + nomes);
    }
}