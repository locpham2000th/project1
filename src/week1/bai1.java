package week1;

public class bai1 {

    public static void week1bai1(){

        System.out.println("Các hợp số < 100");
        for(int i = 2; i < 100; i++){
            if(i % 2 == 0){
                System.out.print(i + "  ");
            }else {
                for(int v = 2; v <= i/2; v++){
                    if(i%v == 0){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }
}
