package week2.C;

public class bai3 {

    public static void main(String[] args) {
        int[] A = {4, 6, 3, 8, 5, 11, 19, 15};
        int min = 10000000;
        int index = 0;
        for(int i = 0; i < A.length; i++){
            if(min > A[i]){
                min = A[i];
                index = i;
            }
        }
        System.out.println("Số nhỏ nhất là: " + min);
        System.out.println("Vị trí của số đấy là: " + index);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
