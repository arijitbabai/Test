import java.io.*;
import java.util.Scanner;

public class ArrayRange {

    public static void main(String[] args) {
        int array[]= {12, -3, -2, -1, 5, 6, 7, 9, 11, 12, 13, 15, 16};
//        String s = Integer.toString(arr[0])+ Integer.toString(arr[1]);
//        System.out.println(s);
//        System.out.println(arr.length);

        int count=0;
        int i;
        String res="";
        for (  i=0 ; i < array.length - 1 ; i++){
            if(array[i+1] == array[i] + 1){
                count++;
            }
            else{
                if (count >= 2) {
//                    System.out.println("Hi");
                    res = res + Integer.toString(array[i- count]) + "-" + Integer.toString(array[i ]);
                }
                else{
                    res = res + Integer.toString(array[i]);
                }

                if ((i + 1) != array.length - 1) {
                    res += ",";
                }
                count=0;
            }
        }
        System.out.println(i);
        if (count >= 2) {
//                    System.out.println("Hi");
            res = res + Integer.toString(array[i- count]) + "-" + Integer.toString(array[i]);
        }
        if(count == 1){
            res += Integer.toString(array[i-1])  + "," + Integer.toString(array[i]);
        }

        System.out.println(res);
//        String hex =Integer.toHexString(123543);
//        System.out.println(hex);
    }
}


