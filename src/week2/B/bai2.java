package week2.B;

import java.util.Scanner;

public class bai2 {

    public static void bai2week2() {
        System.out.println("Cho số tự nhiên N bất kỳ, tính tổng\n" +
                "S= 1+ 1/2! + 1/3! + … + 1/N!");
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
