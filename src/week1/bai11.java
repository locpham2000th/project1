package week1;

import java.util.Random;
import java.util.Scanner;

public class bai11 {

    public static void bai11week1() {
        System.out.println("Viết chương trình tráo đổi ngẫu nhiên vị trí một dãy số cho trước");
        Random ran = new Random();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ramdom = ran.nextInt(N);
        System.out.println(ramdom);
    }

}
