package week1;

public class bai2 {

    static boolean lasonguyento(int n){
        if(n < 2) return false;

        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int start = 1;
        while (count <= 20){
            if(lasonguyento(start) == true){
                System.out.print(start + "  ");
                count ++;
            }
            start++;
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
