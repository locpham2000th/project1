package week2.C;

public class bai8 {

    public static int searchElement(int[] A){
        int result = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                result = i;
                break;
            }
        }
        return result;
    }

    public static int countElementZero(int[] A){
        int result = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                result++;
            }
        }
        return result;
    }

    public static void delete(int[] A, int k){
        for( int i = k; i < A.length - 1; i++){
            A[i] = A[i+1];
        }
    }

    public static void main(String[] args) {
        int[] list = {4,4,2,0,0,7,9,1,1,0};
        int countZero = countElementZero(list);
        int x = countZero;
        while (countZero != 0){
            int k = searchElement(list);
            delete(list,k);
            countZero--;
        }
        for (int i = 0; i < list.length - x; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
