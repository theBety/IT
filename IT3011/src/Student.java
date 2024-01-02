public class Student {
    private String jmeno;
    private String prijmeni;
    private int vek;
    
    public String getJmeno() {
        return jmeno;
    }
    public int getVek() {
        return vek;
    }
    public void setVek(int vek) {
        this.vek = vek;
        if (vek < 0) {
            this.vek = vek * (-1);
        }
    }

    public Student(String jmeno, String prijmeni, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        setVek(vek);
    }

    public void vypis(int id) {
        System.out.println("Vytvoren student " + id + ":" + jmeno + " " + prijmeni + " " + vek + " je " + zletily());
    }

    public String zletily() {
        if (vek < 18) {
            return "nezletily";
        } else {
            return "zletily";
        }
    }
}
