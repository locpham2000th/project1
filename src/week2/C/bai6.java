package week2.C;

import java.util.HashSet;
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

    public static void main(String[] args) {
        int[] A = {5, 3, 4, 9, 10, 6, 15, 8};
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
