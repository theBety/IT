import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dlouheSlovo = "";
        //ukol 1
        boolean jablko = false;
        String prohozeno;
        System.out.println("jak velke bude pole ");
        int velikost = sc.nextInt();
        String[] p = new String[velikost];

        for (int i = 0; i < p.length; i++) {
            System.out.println("vlozte slovo ");
            p[i] = sc.next();

            if (dlouheSlovo.length() < p[i].length()) {
                dlouheSlovo = p[i];
            }
            if (p[i].equals("jablko")) {
                jablko = true;
            }
        }
        System.out.println("Vypis pole: " + Arrays.toString(p));
        prohozeno = p[0];
        p[0] = p[p.length - 1];
        p[p.length - 1] = prohozeno;
        System.out.println("Vypis pole, prohozene prvni a posledni slovo" + Arrays.toString(p));
        System.out.println("Dlouhe slovo: " + dlouheSlovo);
        if (jablko) {
            System.out.println("pole obsahuje jablko");
        }
        //ukol 2

        Student[] p1 = new Student[5];
        double prumerVsech = 0;
        int studentiC1c = 0;
        p1[0] = new Student("kacka", "bendova", "c1c", 1.6);
        p1[1] = new Student("martina", "ilko", "c1c", 1.4);
        p1[2] = new Student("ivo", "faltus", "c1c", 2);
        p1[3] = new Student("nela", "jandova", "u1", 1.3);
        p1[4] = new Student("kiki", "budzakoska", "g1", 1.7);
        for (int i = 0; i < 5; i++) {
            System.out.println(p1[i]);
            prumerVsech += (p1[i].getPrumer()) / 5;
            if (p1[i].getTrida().equals("c1c")) {
                studentiC1c++;
            }
        }
        System.out.println("prumer vsech: " + prumerVsech);
        System.out.println("Tridu C1c navstevuje celkem " + studentiC1c + " studentu");
    }
}