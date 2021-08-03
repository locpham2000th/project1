package week3;

public class bai6 {

    public static String getLastName(String fullName){
        int start = fullName.indexOf(" ");
        int end = start;
        while (fullName.indexOf(" ",end + 1) != -1){
            end = fullName.indexOf(" ", end + 1);
        }
        String result = fullName.substring(start + 1, end);
        return result;
    }

    public static void bai6week3() {
        System.out.println("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là “Thị”.");
        String[] list = {"Phạm Xuân Lộc","Nguyễn Văn An", "Bùi Thu Hoài","Bùi Thị Diệp Chi", "Trần Thị Thương","Nguyễn Khánh Huyền", "Lê Thu An", "Phạm Văn Phúc", "Đoàn Khánh Linh", "Vũ Thị An"};
        int cnt = 0;
        for (int i = 0; i < list.length; i++){
            String lastName = getLastName(list[i]);
            if (lastName.equals("Thị")){
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
