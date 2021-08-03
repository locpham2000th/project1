package week1;

import java.util.ArrayList;
import java.util.List;

public class bai10 {

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

    public static void bai10week1() {
        System.out.println("Cho trước số tự nhiên N bất kỳ (đã gán trước đó). In ra màn hình tất cả các ước số nguyên tố khác nhau của N.");
        int N = 12;
        int i = 2;
        List<Integer> result = new ArrayList<>();
        while (i <= N){
            if(N % i == 0){
                if(songuyento(i)){
                    result.add(i);
                }
            }
            i++;
        }
        for (int v = 0; v < result.size(); v++){
            System.out.println(result.get(v));
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
