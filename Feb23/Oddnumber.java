package Feb23;

import java.util.ArrayList;
import java.util.List;

public class Oddnumber {
    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = l ; i <= r ; i++){
            if (i%2==1)
                arr.add(i);
        }
        return arr;

    }
    public static void main(String[] args) {
        List<Integer> res= oddNumbers(3,10);
        for( int i = 0 ; i < res.size(); i++)
            System.out.println(res.get(i));
    }
}
