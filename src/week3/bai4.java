package week3;

public class bai4 {

    public static void main(String[] args) {
        String fullName = "Phạm Xuân Lộc";
        String text = " ";
        int i = fullName.indexOf(text);
        String firstName = fullName.substring(0,i);
        System.out.println(firstName);
    }

}
