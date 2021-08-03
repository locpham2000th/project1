package week2.C;

public class bai4 {

    public static void bai8week2() {
        System.out.println("Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này và tất cả các chỉ số ứng với giá trị max này.");
        int[] A = {4, 6, 3, 8, 5, 11, 19, 15};
        int max = -10000000;
        int index = 0;
        for(int i = 0; i < A.length; i++){
            if(max < A[i]){
                max = A[i];
                index = i;
            }
        }
        System.out.println("Số nhỏ nhất là: " + max);
        System.out.println("Vị trí của số đấy là: " + index);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
