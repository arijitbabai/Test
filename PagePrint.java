import java.util.Arrays;

public class PagePrint {
    static void print(int sheet, String s, int first, int second){
        System.out.print("s" + sheet + ","+ s + ",");
        if(first != 0 ) System.out.print(first);
        else
            System.out.print("blank");
        System.out.print(",");
        if(second != 0) System.out.println(second);
        else
            System.out.println("blank");
    }

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
//        Arrays.fill(arr,0);
        int page_number= 14;
        int sheet= 4;
        int n = page_number;
        int page_count=0;
        for(int i = 0 ; i < sheet ; i++){
            if(n > 0) arr[i][1] = ++page_count;
            n--;
            if(n > 0) arr[i][2] = ++page_count;
            n--;
        }
        for(int i = sheet-1; i >= 0 ; i--){
            if(n > 0) arr[i][3] = ++page_count;
            n--;
            if(n > 0) arr[i][0] = ++page_count;
            n--;
        }
        for(int i = 0 ; i < sheet ;i++ ){
            print(i+1,"front",arr[i][0],arr[i][1]);
            print(i+1, "back",arr[i][2],arr[i][3]);
        }
    }
}
