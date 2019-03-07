public class UsPhone {
    public static void main(String[] args) {
        String str = "123-456-7890";
        String stringarray[] =str.split("");
        int len = stringarray.length;
//        int array[] = new int[str.length()];
//        int i =0 ;
//        for( String s:stringarray){
//            array[i] =Integer.parseInt(s);
//            i++;
//        }
        if(len == 12 && stringarray[3].equals("-") && stringarray[7].equals("-"))
            System.out.println(stringarray.length);

        System.out.println(stringarray.length);

//        System.out.println(array[1]);
    }
}
