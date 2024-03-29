package week2.C;

import java.util.Scanner;

public class bai5 {

    public static boolean hopso(int n){
        boolean check = false;
        if(n % 2 == 0){
            check = true;
        }else {
            for(int v = 3; v <= n/2; v++){
                if(n%v == 0){
                    check = true;
                    break;
                }
            }
        }
        return check;
    }

    public static boolean lasonguyento(int n){
        if(n < 2) return false;

        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void bai9week2() {
        System.out.println("Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có bao nhiêu số nguyên tố, có bao nhiêu hợp số.");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
            scanner.nextLine();
        }
//      {4, 6, 3, 8, 5, 11, 19, 15};
        int countHopSo = 0;
        int countSoNguyenTo = 0;
        for (int i = 0; i < A.length; i++){
            if(hopso(A[i])){
                countHopSo++;
            }
            if(lasonguyento(A[i])) countSoNguyenTo++;
        }
        System.out.println("Số hợp số là: " + countHopSo);
        System.out.println("Số số nguyên tố là: " + countSoNguyenTo);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
