public class Nastaveni {
    private int zrni = 20;
    private int akry = 10;

    //region Set&Get
    public int getZrni() {
        return zrni;
    }

    public void setZrni(int zrni) {
        this.zrni = zrni;
    }

    public int getAkry() {
        return akry;
    }

    public void setAkry(int akry) {
        this.akry = akry;
    }

    //endregion
    public String oseti() {
        if (akry <= zrni) {
            setAkry(akry);
            zrni -= akry;
        }
        return "nemate dostatek zrni";
    }

    public String urodaOseti(int oseti) {

        return " ";
    }

}
