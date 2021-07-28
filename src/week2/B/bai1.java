package week2.B;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        double p = 0;
        double s = 0;
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Hãy nhập n: ");
            n = input.nextInt();
        }while (n <= 0);

        for(int i = 1; i <= n; i++){
            p += i;
            s += 1.0/p;
        }
        System.out.println(s);
    }

}
