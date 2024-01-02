import java.util.Random;

public class Mazlicek {
    Random r = new Random();
    private String jmeno;
    private int stav;
    private int jidlo;
    private int cistota;
    private int zabava;

    //region Set&Get
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getNalada() {

        if (stav < 4) {
            return "mazlicek byl odebran ochranci zvirat. hra konci";
        }
        if (stav < 9) {
            return "nemocny";
        }
        if (stav < 16) {
            return "nespokojeny";
        }
        if (stav < 23) {
            return "v pohode";
        }

        return "stastny";

    }

    public int getStav() {
        return stav;
    }

    public void setStav(int stav) {
        this.stav = stav;
    }

    public int getJidlo() {
        return jidlo;
    }

    public void setJidlo(int jidlo) {
        if (jidlo > 10) {
            jidlo = 10;
        }
        this.jidlo = jidlo;
    }

    public int getCistota() {
        return cistota;
    }

    public void setCistota(int cistota) {
        if (cistota > 10) {
            cistota = 10;
        }
        this.cistota = cistota;
    }

    public int getZabava() {
        return zabava;
    }

    public void setZabava(int zabava) {
        if (zabava > 10) {
            zabava = 10;
        }
        this.zabava = zabava;
    }

    //endregion
    public Mazlicek() {
        jidlo = r.nextInt(6) + 4;
        cistota = r.nextInt(6) + 4;
        zabava = r.nextInt(6) + 4;
        stav = jidlo + cistota + zabava;
    }
}
