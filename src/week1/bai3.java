package week1;

public class bai3 {

    static boolean lasonguyento(int n){
        if(n < 2) return false;

        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void bai3week1() {
        System.out.println("In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000");
        int start = 1000;
        while (start <= 2000){
            if(lasonguyento(start) == true){
                System.out.println(start);
            }
            start++;
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
