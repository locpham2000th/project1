package week2.B;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        double p = 1;
        double s = 0;
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Hãy nhập n: ");
            n = input.nextInt();
        }while (n <= 0);

        for(int i = 1; i <= n; i++){
            p = p * i;
            s += 1.0/p;
        }
        System.out.println(s);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
