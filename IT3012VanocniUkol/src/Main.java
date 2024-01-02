import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //ukol 1
        Zamestnanec z = new Zamestnanec();

        System.out.println("zadejte jmeno, bydliste a plat zamestnance");
        System.out.println("Jmeno: ");
        z.setJmeno(sc.nextLine());
        System.out.println("Bydliste: ");
        z.setBydliste(sc.nextLine());
        System.out.println("Plat: ");
        z.setPlat(sc.nextInt());
        int cislo = 0;
        while (cislo != 6) {
            System.out.println(" 1 - vypis informaci o zamestnanci\n 2 - zmena jmena zamestnance\n 3 - zmena bydliste zamestnance\n 4 - zmena platu zamestnance\n 5 - zvyseni/snizeni platu zamestnance\n 6 - ukonceni programu");
            cislo = sc.nextInt();
            if (cislo == 1) {
                System.out.println(z.vypis());
            }
            if (cislo == 2) {
                sc.nextLine();
                System.out.println("Zadejte nove jmeno: ");
                z.setJmeno(sc.nextLine());
                System.out.println("nove jmeno je " + z.getJmeno());
            }
            if (cislo == 3) {
                sc.nextLine();
                System.out.println("Zadejte nove bydliste: ");
                z.setBydliste(sc.nextLine());
                System.out.println("nove bydliste je " + z.getBydliste());
            }
            if (cislo == 4) {
                sc.nextLine();
                System.out.println("Zadejte novou vysi platu: ");
                z.setPlat(sc.nextInt());
                System.out.println("nova vyse platu je " + z.getPlat());
            }
            if (cislo == 5) {
                sc.nextLine();
                System.out.println("pro snizeni zadejte 1, pro zvyseni 2. pote zadejte castku o kterou chcete plat zvysit nebo snizit");
                z.zmenaPlatu(sc.nextInt(), sc.nextInt());
                System.out.println(z.getPlat());
            }
        }
        //ukol2
        Mazlicek m = new Mazlicek();
        String kocka = """
                kocka:
                 /\\_/\\
                ( o.o )
                 > ^ <
                """;
        String pes = """
                pes:
                ,-.___,-.
                \\_/_ _\\_/
                  )O_O(
                 { (_) }
                  `-^-'
                """;
        String krava = """
                krava:
                ((...))
                ( o o )
                 \\   /
                  ^_^
                """;
        String tucnak = """
                tucnak:
                   _
                 ('v')
                //-=-\\\\
                (\\_=_/)
                 ^^ ^^
                """;
        String[] zvirata = {"kocka", "pes", "krava", "tucnak"};
        String zvire;
        do {
            System.out.println(kocka + "\n" + pes + "\n" + krava + "\n" + tucnak);
            System.out.println("Vyberte si sveho mazlicka. pro vybrani napiste druh zvirete");
            zvire = sc.nextLine();
        } while (!Arrays.asList(zvirata).contains(zvire.trim().toLowerCase()));

        System.out.println("jak se bude jmenovat?");
        m.setJmeno(sc.nextLine());
        System.out.println("zvire: " + zvire + "\n" + "jmeno: " + m.getJmeno());
        int pocetKol = 0;

        while (m.getStav() > 5) {
            System.out.println("aktualni stav: " + "\n" + "jidlo: " + printStars(m.getJidlo()) + "\n" +
                    "zabava: " + printStars(m.getZabava()) + "\n" + "cistota: " + printStars(m.getCistota()) + "\n" + "nalada: " + m.getNalada());

            System.out.println("jakou akci chcete provest \n 1 - nakrmit \n 2 - jit si hrat \n 3 - umyt se \n 0 - dani k adopci");
            int odpoved = sc.nextInt();

            if (odpoved == 0) {
                break;
            }
            if (odpoved == 1) {
                m.setJidlo(m.getJidlo() + r.nextInt(2) + 1);
                m.setCistota(m.getCistota() - (r.nextInt(2) + 1));
                m.setZabava(m.getZabava() - (r.nextInt(2) + 1));
            }
            if (odpoved == 2) {
                m.setJidlo(m.getJidlo() - (r.nextInt(2) + 1));
                m.setCistota(m.getCistota() - (r.nextInt(2) + 1));
                m.setZabava(m.getZabava() + r.nextInt(2) + 1);
            }
            if (odpoved == 3) {
                m.setJidlo(m.getJidlo() - (r.nextInt(2) + 1));
                m.setCistota(m.getCistota() + r.nextInt(2) + 1);
                m.setZabava(m.getZabava() - (r.nextInt(2) + 1));
            }
            m.setStav(m.getJidlo() + m.getZabava() + m.getCistota());
            pocetKol++;
        }
        System.out.println("mazlicek byl odebran ochranci zvirat. hra konci");
        System.out.println("dozil se " + pocetKol + " kol");
    }

    public static String printStars(int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += "* ";
        }
        return text + " " + "( " + count + " )";
    }
}
