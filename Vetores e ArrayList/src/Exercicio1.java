import java.util.ArrayList;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Beatriz");
        nomes.add("Marcos");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
