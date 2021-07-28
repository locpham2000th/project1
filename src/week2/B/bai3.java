package week2.B;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        double p = 0;
        double s = 0;
        double c = 1;
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Hãy nhập n: ");
            n = input.nextInt();
        }while (n <= 0);

        for(int i = 1; i <= n; i++){
            c *= i;
            p += c;
            s += 1.0/p;
        }
        System.out.println(s);
    }

}
