public class Titulo implements Comparable<Titulo> {
    String string;

    public Titulo(String string){
        this.string = string;
    }

    public int compareTo(Titulo outroTitulo){
        return this.string.compareTo((outroTitulo.string));
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "string='" + string + '\'' +
                '}';
    }
}
