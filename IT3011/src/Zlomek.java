public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }
    public void setJmenovatel(int jmenovatel) {
        this.jmenovatel = jmenovatel;
    }

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }
    public double vypocitej(){
        return (double) citatel/jmenovatel;
    }
    public double prevrat(){
        return (double) jmenovatel /citatel;
    }
    public String vypis1(){
        return citatel + "/" + jmenovatel;
    }
}
