import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCheck {
    public static void main(String args[]){
        int arr[] = {1,2,3,3,4,5,5,6,6,6,6};
        Set<Integer> set = new HashSet<Integer>();
        int end = arr.length;
        for( int i = 0 ; i < end ; i++){
            set.add(i);
        }
        System.out.println(set);
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
