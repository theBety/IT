import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//3 cykly
        int number = 1;
        int number1 = 1;

        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
        while (number < 101) {
            System.out.println(number++);
        }
        do {
            System.out.println(number1);
            number1++;
        }while (number1!=101);
//teplota
        int teplota = 1;
        int pocetTeplot = 0;
        int soucetTeplot = 0;
        double aritPrumer;
        double prumerCelsia;
        int nejvyssi = 0;
        int nejnizsi = Integer.MAX_VALUE;
        System.out.println("pro ukonceni zadejte nulu. Zadejte teplotu v kelvinech: ");

        while (teplota != 0) {
            teplota = s.nextInt();
            System.out.println("teplota v kelvinech: " + teplota);
            pocetTeplot++;
            soucetTeplot += teplota;
            if (nejvyssi < teplota) {
                nejvyssi = teplota;
            }
            if (nejnizsi > teplota && teplota != 0) {
                nejnizsi = teplota;
            }
        }
        aritPrumer = (double) soucetTeplot / (pocetTeplot - 1);
        prumerCelsia = aritPrumer - 273.15;

        System.out.println(" ");

        System.out.println("Pocet zadanych teplot: " + (pocetTeplot - 1) + "(bez 0)");
        System.out.println("Soucet hodnot teplot: " + soucetTeplot);
        System.out.println("Aritmeticky prumer: " + aritPrumer);
        System.out.println("Aritmeticky prumer v celsia: " + prumerCelsia);
        System.out.println("Nejvyssi teplota: " + nejvyssi);
        System.out.println("nejnizsi teplota: " + nejnizsi);

//student
        Student[] studenti = new Student[5];
        int pocetZletilych = 0;
        int nejstarsiVek = 0;
        int nejstarsiStudent = 0;

        for (int k = 0; k < 5; k++) {
            System.out.println("Jmeno studenta:");
            String jmeno = s.nextLine();
            System.out.println("Prijmeni studenta: ");
            String prijmeni = s.nextLine();
            System.out.println("Vek studenta: ");
            int vek = s.nextInt();

            studenti[k] = new Student(jmeno, prijmeni, vek);
            studenti[k].vypis(k);

            if(studenti[k].getVek() > 17){
                pocetZletilych++;
            }
            if(nejstarsiVek < studenti[k].getVek()){
                nejstarsiVek = studenti[k].getVek();
                nejstarsiStudent = k;
            }
            s.nextLine();
        }
        System.out.println("pocet zletilych studentu: " + pocetZletilych);
        System.out.println("nejstarsi student: " + studenti[nejstarsiStudent].getJmeno());




//zlomek
        int citatel;
        int jmenovatel;
        System.out.println("zadejte citatele a jmenovatele: ");
        citatel = s.nextInt();
        jmenovatel = s.nextInt();
        int prikaz;
        Zlomek z = new Zlomek(citatel, jmenovatel);

        do {
            System.out.println(" - výpis zlomku - 1 \n - změna čitatele zlomku - 2\n - změna jmenovatele zlomku - 3\n - výpočet reálné hodnoty zlomku - 4\n - výpočet převrácení zlomku - 5\n - ukončení programu - 0");
            prikaz = s.nextInt();
            if (prikaz == 1) {
                System.out.println(z.vypis1());
            }
            if (prikaz == 2) {
                System.out.println("napis cislo pro noveho citatele zlomku:");
                citatel = s.nextInt();
                z.setCitatel(citatel);
                System.out.println(citatel);
            }
            if (prikaz == 3) {
                System.out.println("napis cislo pro noveho jmenovatele zlomku:");
                jmenovatel = s.nextInt();
                z.setJmenovatel(jmenovatel);
                System.out.println(jmenovatel);
            }
            if (prikaz == 4) {
                System.out.println("vypocet realne hodnoty zlomku: ");
                System.out.println(z.vypocitej());
            }
            if (prikaz == 5) {
                System.out.println("vypocet realne hodnoty prevraceneho zlomku: ");
                System.out.println(z.prevrat());
            }
        } while (prikaz != 0);
    }
}