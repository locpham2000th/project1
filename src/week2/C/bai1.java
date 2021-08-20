package week2.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bai1 {

    public static void bai5week2() {
        System.out.println("Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo thứ tự giảm dần.");
        System.out.println("dãy có bao nhiêu phần tử");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] list = new int[N];
        for (int i = 0; i < N; i++){
            list[i] = scanner.nextInt();
            scanner.nextLine();
        }
//      {4,2,0,7,9,1};
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length - i - 1; j++){
                if(list[j] < list[j+1]){
                    int tmp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = tmp;
                }
            }
        }

        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
