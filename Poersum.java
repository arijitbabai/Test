import java.util.Scanner;
import java.lang.Math;

public class Poersum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
//        int a = (int)Math.pow(l,r);
//        if (a == 8)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
        int arr[] = new int[r-l +1];
        powersum(0,0,2,2,l,r,arr);
        int len=0;
        for(int i =0 ; i< r-l ;i++ ){
            if(arr[i] ==1)
                len++;
        }
        System.out.println(len);
    }

    private static void powersum(int a, int b, int p, int q, int l, int r,int arr[]) {
        if(a <= 1 && p > 2)
            return;
        if(b <= 1 && q > 2)
            return;
        if (Math.pow(a,p) + Math.pow(b,q) > r) {
            return;
        }
        if(((Math.pow(a,p) + Math.pow(b,q)) >= l) && ((Math.pow(a,p) + Math.pow(b,q)) <= r)){
            arr[r - (int)(Math.pow(a,p) + Math.pow(b,q))] =1;
        }
        powersum(a+1,b,p,q,l,r,arr);
        powersum(a,b+1,p,q,l,r,arr);
        powersum(a,b,p+1,q,l,r,arr);
        powersum(a,b,p,q+1,l,r,arr);
    }
}
