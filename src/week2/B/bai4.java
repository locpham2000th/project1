package week2.B;

public class bai4 {

    private static int fibonasi(int n){
        if(n == 0){
            return 1;
        }
        if (n == 1){
            return 2;
        }
        return fibonasi(n-1) + fibonasi(n-2);
    }

    public static void bai4week2() {
        System.out.println("Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). Tính số Fibonaxi thứ N.");
        int result = fibonasi(5);
        System.out.println(result);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
