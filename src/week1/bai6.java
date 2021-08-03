package week1;

import java.util.ArrayList;
import java.util.List;

public class bai6 {

    private static boolean sohoanhao(int n){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int i = 2;
        while( i <= Math.sqrt(n)){
            if(n % i == 0){
                list.add(i);
                if(i != (n / i)){
                    list.add(n/i);
                }
            }
            i++;
        }
        int sum = 0;
        for(int v = 0; v < list.size(); v++){
            sum = sum + list.get(v);
        }
        if(sum == n){
            return true;
        }
        return false;
    }

    public static void bai6week1() {
        System.out.println("In ra màn hình 5 số hoàn hảo đầu tiên (Số hoàn hảo là số có tổng bằng các ước số của mình kể cả 1");
        int count = 0;
        int start = 6;
        while (count < 5){
            if(sohoanhao(start) == true){
                System.out.print(start + "  ");
                count ++;
            }
            start ++;
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
