public abstract class Veiculo {
    String name1;
    String name2;
    int anoDeLancamento;
    int anoDeLancamento2;

    public void marca1() {
        System.out.println(name1 + " É uma respeitada marca e foi lançada em " + getAnoDeLancamento());
    }


    public void marca() {
        marca1();
        System.out.println(name1);
    }


    public void marca2() {
        System.out.println(name2 + " É uma respeitada marca e foi lançada em  " + getAnoDeLancamento2());
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento = 1948;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }


    public int getAnoDeLancamento2() {
        return anoDeLancamento2 = 1903;
    }

    public void setAnoDeLancamento2(int anoDeLancamento2) {
        this.anoDeLancamento2 = anoDeLancamento2;
    }
}
