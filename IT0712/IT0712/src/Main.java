import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ukol 1
        Datum d = new Datum();
        int den, mesic, rok;

        do {
            System.out.println("Zadejte datum (den): ");
            den = sc.nextInt();
            System.out.println("Zadejte datum (mesic): ");
            mesic = sc.nextInt();
            System.out.println("Zadejte datum (rok): ");
            rok = sc.nextInt();

        } while (!(d.setDen(den) && d.setMesic(mesic) && d.setRok(rok)));
        System.out.println(d.getDen() + "." + d.getMesic() + " " + d.getRok());

        //ukol 2
        int pricitaciCislo = 1;
        int nasobilkaPrvniCislo = 1;
        int i;
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(nasobilkaPrvniCislo + " ");
                nasobilkaPrvniCislo += pricitaciCislo;
            }
            System.out.println();
            pricitaciCislo++;
            nasobilkaPrvniCislo = pricitaciCislo;
        }
        Ctverec c = new Ctverec(5);
        System.out.println(c.FillSquare());
        System.out.println();
        System.out.println(c.DrawSquare());

        System.out.println(c.DrawSquare());


    }
}