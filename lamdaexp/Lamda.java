package lamdaexp;

public class Lamda {
    public static void main(String[] args) {
        MyFunction m = (t1,t2)-> (t1+" " +t2);
        String s= m.apply("Lambda Body","test");
        System.out.println(s);
    }

}
