import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
    //ukol 1
        int cislaMensi0 = 0;
        int nejmensiCislo = Integer.MAX_VALUE;
        int cislaDelitelna3 = 0;
        int kolikCisel3 = 0;
        for (int i = 0; i < 5; i++) {
            int cislo = r.nextInt(100) - 50;
            if (cislo + 20 < 0) {
                cislaMensi0++;
            }
            if (nejmensiCislo > cislo) {
                nejmensiCislo = cislo;
            }
            if (cislo % 3 == 0) {
                cislaDelitelna3 += cislo;
                kolikCisel3++;
            }
            System.out.println(cislo);
        }
        System.out.println("Nejmensi cislo: " + nejmensiCislo);
        System.out.println("Kolik cisel pri pricteni 20 k cislu je zapornych: " + cislaMensi0);

        if (kolikCisel3 == 0) {
            System.out.println("zadne cislo neni delitelne 3");
        }
        if (kolikCisel3 != 0) {
            double delitelnost3 = cislaDelitelna3 / kolikCisel3;
            System.out.println("Prumer vsech cisel, ktere jsou nasobkem 3: " + delitelnost3);
        }
    //ukol 2
        /*Student s = new Student();

        int prumerDobre = 0;
        String kteryStudent = null;
        double predchoziPrumer = Integer.MAX_VALUE;
        System.out.println("kolik bude studentu: ");

        int pocetStudentu = sc.nextInt();


        for (int j = 0; j < pocetStudentu; j++) {
            System.out.println("jmeno studenta: ");
            s.setJmeno(sc.next());
            System.out.println("prijmeni studenta: ");
            s.setPrijmeni(sc.next());
            System.out.println("prumer studenta: ");
            s.setPrumer(sc.nextDouble());
            System.out.println(s.vyznamenani(s.getPrumer()));

            if (s.getPrumer() < 2.5) {
                prumerDobre++;
            }
            if (predchoziPrumer > s.getPrumer()) {
                predchoziPrumer = s.getPrumer();
                kteryStudent = s.getJmeno() + s.getPrijmeni();
            }
        }
        System.out.println("kolik studentu ma lepsi prumer znamek nez 2,5: " + prumerDobre);
        System.out.println("student, ktery ma nejlepsi prumer znamek: " + kteryStudent);*/

    }
}
