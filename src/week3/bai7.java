package week3;

public class bai7 {

    public static String getName(String fullName){
        String text = " ";
        while (fullName.indexOf(text) != -1){
            int i = fullName.indexOf(text);
            fullName = fullName.substring(i+1);
        }
        return fullName;
    }

    public static void bai7week3() {
        System.out.println("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có tên bắt đầu bằng chữ “H”.");
        String[] list = {"Phạm Xuân Lộc","Nguyễn Văn An", "Bùi Thu Hoài","Bùi Thị Diệp Chi", "Trần Thị Thương","Nguyễn Khánh Huyền", "Lê Thu An", "Phạm Văn Phúc", "Đoàn Khánh Linh", "Vũ Thị An"};
        int cnt = 0;
        for (int i = 0; i < list.length; i++){
            String name = getName(list[i]);
            if (name.charAt(0) == 'H'){
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
