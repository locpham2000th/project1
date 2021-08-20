package week2.C;

import java.util.Scanner;

public class bai7 {

    public static void bai11week2() {
        System.out.println("Cho một dãy số tự nhiên, hãy tìm 1 số tự nhiên nhỏ nhất c không bằng bất cứ số nào trong dãy trên.");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        int[] list = new int[N];
        for (int i = 0; i < N; i++){
            list[i] = scanner.nextInt();
            scanner.nextLine();
        }
//      {4,4,2,0,0,7,9,1,1};
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length - i - 1; j++){
                if(list[j] >= list[j+1]){
                    int tmp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = tmp;
                }
            }
        }
        int min = list[0];
        int countmin = 1;
        int result = list[0];
        for(int i = 1; i < list.length; i++){
            if(list[i] == min){
                countmin++;
            }else {
                if(countmin == 1){
                    result = min;
                    break;
                }
                min = list[i];
                countmin = 1;
            }
        }
        System.out.println(result);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
