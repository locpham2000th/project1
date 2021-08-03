package week1;

import java.util.ArrayList;
import java.util.List;

public class bai9 {

    private static boolean songuyento(int n){
        boolean check = true;
        for (int v = 2; v < n; v++ ){
            if(n % v == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void bai9week1() {
        System.out.println("Cho số tự nhiên N>1 bất kỳ (đã gán trước đó). In ra khai triển thành tích các số nguyên tố tính từ nhỏ đến lớn ");
        int N = 24;
        int i = 0;
        int point = N;
        int start = 2;
        List<Integer> nguyento = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        while (start <= N){
            if(songuyento(start) == true){
                nguyento.add(start);
            }
            start++;
        }

        while(nguyento.get(i) <= N){
            if(N % nguyento.get(i) == 0){
                N = N / nguyento.get(i);
                result.add(nguyento.get(i));
            }else {
                i++;
            }
        }
        System.out.print(point + " = ");
        for (int v = 0; v < result.size(); v++){
            if (v == result.size() - 1){
                System.out.println(result.get(v));
                break;
            }
            System.out.print(result.get(v) + " * ");

        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
