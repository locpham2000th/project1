package week3;

public class bai2 {

    public static void bai2week3() {
        System.out.println("Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần xuất hiện xâu con “loc”");
        String start = "loc biet lam tat ca moi thu, loc loc";
        String find = "loc";
        int cnt = 0;
        while (start.length() > find.length()){
            int i = start.indexOf(find);
            if(i >= 0){
                cnt++;
                start = start.substring(i + find.length());
            }else {
                break;
            }
        }
        System.out.println(cnt);
        System.out.println("Phạm Xuân Lộc - 20183786");
    }

}
