package Mar03;

public class RepeatedString {
    public static void main(String[] args) {
        String s = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
        int len = s.length();
        int a_count=0;
        long res =0;
        long n;
        n = 549382313570L;
        for( int i = 0 ; i < len ; i++ ){
            if(s.charAt(i) == 'a') a_count++;
        }
        long extra =  n%len;
        if( extra != 0 ){
            for( int i = 0 ; i < extra ; i++)
                if( s.charAt(i) == 'a') res++;
        }
        res = res + (n/len)*a_count;
        System.out.println(res);
        System.out.println("No. of a in string :" +a_count);
        System.out.println("Lenght of the string :" + len);
        System.out.println(extra);
    }
}

