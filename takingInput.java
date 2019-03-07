import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class takingInput
{
    public static void main(String[] args) throws IOException
    {
        //Enter data using BufferReader 
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String line ;
        int i,len,position;
        int flag ;
        int[] arr = new int[26];
        while( (line =  reader.readLine()) != null) {
            len =   line.length();
            Arrays.fill(arr,0);
            flag = 0;
              for(i = 0 ; i < len ; i++ ){
                  if (line.charAt(i) == ' ')
                      continue;
                  else {
                      position = (int)line.charAt(i) - 65;
                      if(arr[position] == 0)
                          arr[position] = 1;
                      else{
                          flag = 1;
                          break;
                      }
                  }
              }
              if(flag == 0){
                  System.out.println(line);
              }
        }
    }
} 