package week2.C;

public class bai2 {

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
        int[] A = {4, 6, 3, 8, 5, 11, 19, 15};
        for(int i = 0; i < A.length; i++){
            if(songuyento(A[i])){
                System.out.print(A[i] + " ");
            }
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
