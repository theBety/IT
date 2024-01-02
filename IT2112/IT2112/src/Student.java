public class Student {
    private String jmeno;
    private String prijmeni;
    private double prumer;

    //region Set&Get
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public double getPrumer() {
        return prumer;
    }

    public void setPrumer(double prumer) {
        if (prumer < 0) {
            this.prumer = prumer * (-1);
        } else {
            this.prumer = prumer;
        }
    }
//endregion


    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", prumer=" + prumer +
                '}';
    }

    public String vyznamenani(double prumer) {
        if (prumer <= 1.6) {
            return "Ma vyznamenani";
        }
        return "Nema vyznamenani";
    }
}
