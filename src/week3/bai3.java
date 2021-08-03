package week3;

public class bai3 {

    public static void bai3week3() {
        System.out.println("Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này");
        String fullName = "Phạm Xuân Lộc";
        String text = " ";
        while (fullName.indexOf(text) != -1){
            int i = fullName.indexOf(text);
            fullName = fullName.substring(i+1);
        }
        System.out.println(fullName);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
