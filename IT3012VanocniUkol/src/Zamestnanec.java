public class Zamestnanec {
    private String jmeno;
    private String bydliste;
    private int plat;

    //region Set&Get
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getBydliste() {
        return bydliste;
    }

    public void setBydliste(String bydliste) {
        this.bydliste = bydliste;
    }

    public int getPlat() {
        return plat;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }

    //endregion
    public Zamestnanec() {
    }

    public void zmenaPlatu(int odpoved, int castka) {
        if (odpoved == 1) {
            plat -= castka;
            return;
        }
        plat += castka;
    }

    public String vypis() {
        return "Jmeno: " + jmeno + "\nBydliste: " + bydliste + "\nPlat: " + plat;
    }
}
