public class Ctverec {
    private final int strana;


    public Ctverec(int strana) {
        this.strana = strana;
    }

    public String FillSquare() {
        for (int j = 0; j < strana; j++) {
            for (int i = 0; i < strana; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        return "";
    }

    public String DrawSquare() {
        for (int y = 0; y < strana; y++) {
            for (int x = 0; x < strana; x++) {
                if (x == 0 || x == strana - 1 || y == 0 || y == strana - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        return "";
    }
}
