package week1;

public class bai2 {

    public static boolean lasonguyento(int n){
        if(n < 2) return false;

        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void bai2week1(){
        int count = 0;
        int start = 1;
        System.out.println("In ra màn hình 20 số nguyên tố đầu tiên");
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
