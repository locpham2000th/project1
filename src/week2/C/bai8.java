package week2.C;

import java.util.Scanner;

public class bai8 {

    public static int searchElement(int[] A){
        int result = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                result = i;
                break;
            }
        }
        return result;
    }

    public static int countElementZero(int[] A){
        int result = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                result++;
            }
        }
        return result;
    }

    public static void delete(int[] A, int k){
        for( int i = k; i < A.length - 1; i++){
            A[i] = A[i+1];
        }
    }

    public static void bai12week2() {
        System.out.println("Cho một dãy số nguyên bất kỳ, hãy xóa đi trong dãy này các số hạng =0 và in ra màn hình các số còn lại.");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        int[] list = new int[N];
        for (int i = 0; i < N; i++){
            list[i] = scanner.nextInt();
            scanner.nextLine();
        }
//      {4,4,2,0,0,7,9,1,1,0};
        int countZero = countElementZero(list);
        int x = countZero;
        while (countZero != 0){
            int k = searchElement(list);
            delete(list,k);
            countZero--;
        }
        for (int i = 0; i < list.length - x; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
