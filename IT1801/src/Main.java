import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        //ukol1
        /*System.out.println("jak velke bude pole ");
        int velikost = sc.nextInt();
        int[] f = new int[velikost];
        double arit = 0;
        double aritL = 0;
        int druheCislo = -11;

        for (int i = 0; i < velikost; i++) {
            f[i] = rd.nextInt(20) - 10;
            if (f[i] > -6 && f[i] < 6) {
                arit += f[i];
                aritL++;
            }
        }
        System.out.println(Arrays.toString(f));

        if (aritL != 0) {
            System.out.println("Aritmeticky prumer intervalu <-5, 5>: " + arit / aritL);
        }
        System.out.print("Delitelne 3mi jsou: ");
        for (int j : f) {
            if (j % 3 == 0 && j != 0) {
                System.out.print(j + ", ");
            }
        }
        Arrays.sort(f);
        System.out.println(" ");
        System.out.println("Druhe nejdelsi cislo: " + f[(f.length) - 2]);*/
        //ukol2 //NEVIM
        Zamestnanec z = new Zamestnanec();
        System.out.println("Kolik bude zamestnancu? ");
        int pocet = sc.nextInt();
        for(int i=0; i<pocet; i++){
            System.out.println("jmeno: ");
            z.setJmeno(sc.next());
            System.out.println("prijmeni: ");
            z.setPrijmeni(sc.next());
            System.out.println("plat: ");
            z.setPlat(sc.nextInt());
            System.out.println(z);
        }

    }
}