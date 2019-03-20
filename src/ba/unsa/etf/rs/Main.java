package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){

        int suma = 0, x = 0;

        for (int i = 0; i <= n; i++) {

            suma = suma + i;

            }

        for (int i = 1; i <= n; i++){

            x = suma % i;

            if (x == 0) System.out.println(i);

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
