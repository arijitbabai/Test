
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistEx {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        ArrayList<Vehicle> vlist = new ArrayList<>();
        Vehicle v = new Vehicle("Basja");
        v.show();
        vlist.add(v);
        vlist.add(v);
        int[] arr = {1,2,3};
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
        System.out.println(vlist.get(0));
        vlist.get(0).show();
        System.out.println(vlist.get(1));
    }
}
