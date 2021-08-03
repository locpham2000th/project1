package week1;

import java.util.Scanner;

public class bai12 {

    private static void draw(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n -i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void bai12week1() {
        System.out.println("Viết chương trình nhập chiều cao h từ bàn phím, sau đó hiển thị các tam giác hình sao có chiều cao h như dưới đây. Chú ý có kiểm tra điều kiện của h: 2<=h<=10. Nếu h nằm ngoài đoạn trên, yêu cầu người dùng nhập lại");
        System.out.println("Hãy nhập chiều cao của tam giác: ");
        while (true){
            Scanner input = new Scanner(System.in);
            int h = input.nextInt();
            if(h <= 10 && h >= 2 ){
                draw(h);
                break;
            }else{
                System.out.println("Hãy nhập lại:");
            }
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
