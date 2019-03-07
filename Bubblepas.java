import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bubblepas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> b= new ArrayList<>();
        int len =0;
        int swap;
        while(scanner.hasNext()){
            b.add(scanner.nextInt());
        }
        len = b.size();
        Integer arr[] = new Integer[len];
        arr = b.toArray(arr);
        for(int i=0 ; i < len - 1 ; i++ ){
            for(int j = 0 ; j < len -1 -i ; j++){
                if(arr[j] > arr[j+1]){
                 swap = arr[j];
                 arr[j] =arr[j+1];
                 arr[j+1] =swap;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
