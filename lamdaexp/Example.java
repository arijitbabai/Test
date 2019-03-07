package lamdaexp;

import java.util.Comparator;

public class Example {
    public static void main(String args[]){
        Comparator<String> stringComparator= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        int c = stringComparator.compare("hello","hello");
        System.out.println(c);
        Comparator<String> stringComparatorLamda =
                (String o1, String o2) -> { return  o1.compareTo(o2);};

        Comparator<String> stringComparatorLamda1 =
                (o1, o2) ->  o1.compareTo(o2);

        int l=stringComparatorLamda.compare("hello","hello");
        System.out.println(l);
        System.out.println(stringComparatorLamda1.compare("hello","world"));
     }
}

