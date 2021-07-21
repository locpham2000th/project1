package week1;

public class bai5 {

    public static void main(String[] args) {
        int n = 1000;
        while (n < 2000){
            if(n % 3 == 0 && n % 7 == 0 && n % 5 == 0){
                System.out.print(n + "  ");
            }
            n++;
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
