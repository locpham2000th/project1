package week3;

public class bai1 {

    public static void main(String[] args) {
        String fullName = "Pham  xuan   loc";
        fullName = fullName.replaceAll("\\s\\s+"," ");
        System.out.println(fullName);
    }

}
