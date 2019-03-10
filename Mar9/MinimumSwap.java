package Mar9;

//import jdk.internal.util.xml.impl.Pair;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MinimumSwap {
    public static void main(String[] args) {
        int arr[] = {2,31,1,38,29,5,44,6,12,18,39,9,48,49,13,11,7,27,14,33,50,21,46,23,15,26,8,47,40,3,32,22,34,42,16,41,24,10,4,28,36,30,37,35,20,17,45,43,25,19};
//        int arr[] = {4 ,3 ,1 ,2};
        int len = arr.length;
//        System.out.println(len);
        // Create two arrays and use as pairs where first
        // array is element and second array
        // is position of first element
        ArrayList<Pair<Integer,Integer>> arrpos = new ArrayList<Pair<Integer,Integer>>();
        for (int i =0 ; i < len ; i++)
            arrpos.add(new Pair<Integer, Integer>(arr[i], i));

        // Sort the array by array element values to
        // get right position of every element as the
        // elements of second array.
        arrpos.sort(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                if( o1.getKey() < o2.getKey())
                    return -1 ;
                    // We can change this to make it then look at the
                    // words alphabetical order
                else if (o1.getKey().equals(o2.getKey()))
                    return 0;
                else
                    return 1;
            }
        });


        // To keep track of visited elements. Initialize
        // all elements as not visited or false.
        Boolean[] visited = new Boolean[len];
        Arrays.fill(visited,false);

        //Initialize result;
        int ans = 0;
//        for(int i = 0 ; i < len ;i++){
//            System.out.print("(" +arrpos.get(i).getValue() + ", " +arrpos.get(i).getKey() +")" );
//        }
        //Traverse array elements
        for(int i =0 ; i < len ; i++){
            // already swapped and corrected or
            // already present at correct pos

            if(visited[i] || arrpos.get(i).getValue() == i)
                continue;
            // find out the number of  node in
            // this cycle and add in ans
            int cycle_size=0;
            int j = i;

            while(!visited[j]){
                //move to next node
                visited[j] = true;
                j = arrpos.get(j).getValue();
                cycle_size++;
            }
            //update answer by adding current cycle
            if(cycle_size > 0)
                ans += (cycle_size -1);
        }
        System.out.println(ans);

    }
}
