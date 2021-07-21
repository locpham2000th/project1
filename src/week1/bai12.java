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

    public static void main(String[] args) {
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
