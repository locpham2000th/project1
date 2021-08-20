package week2.C;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bai6 {

    public static void sapxep(int[] list){
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length - i - 1; j++){
                if(list[j] > list[j+1]){
                    int tmp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    public static void bai10week2() {
        System.out.println("Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy trên thỏa mãn: số này là ước số thực sự của 1 số hạng khác trong dãy trên.");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
            scanner.nextLine();
        }
//      {5, 3, 4, 9, 10, 6, 15, 8};
        sapxep(A);
        Set<Integer> result = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            for (int j = i + 1; j < A.length; j++){
                if(A[j] % A[i] == 0){
                    result.add(A[i]);
                }
            }
        }

        for (int element: result ) {
            System.out.print(element + " ");
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
