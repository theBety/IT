public class Datum {
    private int den;
    private int mesic;
    private int rok;

    //region Set&Get
    public int getDen() {
        return den;
    }

    public boolean setDen(int den) {
        if (den <= 30) {
            this.den = den;
            return true;
        }
        if (den < 0) {
            this.den = den * (-1);
        }

        return false;
    }

    public int getMesic() {
        return mesic;
    }

    public boolean setMesic(int mesic) {
        if (mesic <= 12) {
            this.mesic = mesic;
            return true;
        }
        if (mesic < 0) {
            this.mesic = mesic * (-1);
        }

        return false;
    }

    public int getRok() {
        return rok;
    }

    public boolean setRok(int rok) {
        if (rok <= 2023) {
            this.rok = rok;
            return true;
        }
        if (rok < 0) {
            this.rok = rok * (-1);
        }

        return false;
    }

    //endregion
    public Datum() {
    }
}
