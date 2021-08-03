package week1;

import java.util.Random;

public class bai11 {

    public static void bai11week1() {
        System.out.println("Viết chương trình tráo đổi ngẫu nhiên vị trí một dãy số cho trước");
        Random ran = new Random();
        int ramdom = ran.nextInt(100003);
        System.out.println(ramdom);
    }

}
