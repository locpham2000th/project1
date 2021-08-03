package week2.C;

public class bai3 {

    public static void bai7week2() {
        System.out.println("Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy này và tất cả các chỉ số ứng với giá trị min này.");
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
