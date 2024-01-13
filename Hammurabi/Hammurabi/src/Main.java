import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nastaveni n = new Nastaveni();
        Scanner sc = new Scanner(System.in);
        int akry;
        for (int i = 0; i < 1; i++) {
            System.out.println("Kolik chcete osit akru? ");
            akry = sc.nextInt();
        }
        System.out.println(n.oseti());
    }
}