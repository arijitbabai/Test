package lamdaexp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public interface MyInterface {
    void printIt(String text);

    default public void printUtf8To(String text, BufferedWriter outputStream){
        try {
            outputStream.write(text);
        } catch (IOException e) {
            throw new RuntimeException("Error writing String as UTF-8 to OutputStream", e);
        }
    }

    static void printItToSystemOut(String text){
        System.out.println(text);
    }
}
