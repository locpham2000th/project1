package week1;

public class bai4 {

    public static void bai4week1() {
        System.out.println("In ra màn hình các số <100 và chia hết cho 3,7");
        int n = 0;
        while (n < 100){
            if(n % 3 == 0 && n % 7 == 0){
                System.out.print(n + "  ");
            }
            n++;
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
