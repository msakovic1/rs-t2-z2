package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int y){
        int x;
        for (x=1;x<=8y;x++){

            System.out.println(x);
        }
        return x;
    }

    public static void main(String[] args) {

        int n;

        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n:");
        n = ulaz.nextInt();
        sumaCifara(n);

    }
}
