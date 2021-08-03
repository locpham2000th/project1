package week3;

public class bai3 {

    public static void main(String[] args) {
        String fullName = "Phạm Xuân Lộc";
        String text = " ";
        while (fullName.indexOf(text) != -1){
            int i = fullName.indexOf(text);
            fullName = fullName.substring(i+1);
        }
        System.out.println(fullName);
    }

}
