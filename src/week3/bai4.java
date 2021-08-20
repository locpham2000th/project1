package week3;

import java.util.Scanner;

public class bai4 {

    public static void bai4week3() {
        System.out.println("Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này");
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        String text = " ";
        int i = fullName.indexOf(text);
        String firstName = fullName.substring(0,i);
        System.out.println(firstName);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
