package lamdaexp;


import java.io.*;

public class Example2 {
    public static void main(String[] args) throws IOException {
        MyInterface myIntrc= t -> System.out.println(t);
        myIntrc.printIt("Hello world!");
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        myIntrc.printUtf8To(name, new BufferedWriter(new FileWriter("data.txt", true)));
    }
}
