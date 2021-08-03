package week3;

public class bai1 {

    public static void bai1week3() {
        System.out.println("Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một số dấu cách. Hãy xóa đi các dấu cách thừa và in ra họ tên chính xác.");
        String fullName = "Pham  xuan   loc";
        fullName = fullName.replaceAll("\\s\\s+"," ");
        System.out.println(fullName);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
