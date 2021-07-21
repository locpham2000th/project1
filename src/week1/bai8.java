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

    public static void main(String[] args) {
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
