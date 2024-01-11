public class Student {
    private final String jmeno;
    private final String prijmeni;
    private final String trida;
    private final double prumer;

    public String getTrida() {
        return trida;
    }
    public double getPrumer() {
        return prumer;
    }

    public Student(String jmeno, String prijmeni, String trida, double prumer) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.trida = trida;
        this.prumer = prumer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", trida='" + trida + '\'' +
                ", prumer=" + prumer +
                '}';
    }
}
