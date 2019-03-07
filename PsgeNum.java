import java.io.*;


public class PsgeNum {
    static void print(int sheet, String s,int first,int second){
        System.out.print("s" + sheet + ","+ s + ",");

        if(first != 0) System.out.print(first);
        else
            System.out.print("blank");
        System.out.print(",");
        if(second != 0) System.out.println(second);
        else
            System.out.println("blank");
    }

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int page= Integer.parseInt(reader.readLine());
        int sheet = page/4 + (page%4 == 0?0:1);
        int[][] arr = new int[sheet][4];
        int n = page;
        int page_count=0;
        for(int i =0 ; i < sheet ; i++){
            if(n>0) arr[i][1]=++page_count;
            n--;
            if(n>0) arr[i][2]=++page_count;
            n--;
        }
        for(int i = sheet-1 ; i >= 0 ; i--){
            if(n>0)arr[i][3]=++page_count;
            n--;
            if(n>0)arr[i][0]=++page_count;
            n--;
        }
        for(int i =0 ; i < sheet ; i++){
            print(i+1, "front",arr[i][0],arr[i][1]);
            print(i+1,"back",arr[i][2],arr[i][3]);
        }

    }
}