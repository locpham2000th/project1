package week1;

public class bai7 {

    private static void caua(){
        System.out.println("Câu a: số dư chia hết cho 5");
        int n = 1;
        int count = 0;
        while (n <=100){
            if(n % 5 == 0){
                count++;
            }
            n++;
        }
        System.out.println(count);
    }

    private static void caub(){
        System.out.println("Câu b: chia cho 5 dư 1");
        int n = 1;
        int count = 0;
        while (n <=100){
            if(n % 5 == 1){
                count++;
            }
            n++;
        }
        System.out.println(count);
    }

    private static void cauc(){
        System.out.println("Câu c: chia hết cho 5 dư 2");
        int n = 1;
        int count = 0;
        while (n <=100){
            if(n % 5 == 2){
                count++;
            }
            n++;
        }
        System.out.println(count);
    }

    private static void caud(){
        System.out.println("Câu d: chia cho 5 dư 3");
        int n = 1;
        int count = 0;
        while (n <=100){
            if(n % 5 == 3){
                count++;
            }
            n++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        caua();
        caub();
        cauc();
        caud();
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
