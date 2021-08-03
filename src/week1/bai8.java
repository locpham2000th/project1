package week1;

public class bai8 {

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

    public static void bai8week1() {
        System.out.println("Cho số tự nhiên N bất kỳ (đã gán trước đó), tìm và in ra ước số nguyên tố nhỏ nhất của N.");
        int N = 17;
        int i = 2;
        while( i <= N){
            if(N % i == 0){
                if (songuyento(i)){
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }

        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
