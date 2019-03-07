package Mar03;



public class JumpingCloud {
    public static void main(String[] args) {
        int arr[] = {0,0 ,1, 0, 0, 0, 0, 1, 0, 0};
        int prev = arr[0];
        int len = 0; /* Legth of jump for 0 to 0*/
        int jump = 0; /* No. of jumps*/
        for(int i = 1 ; i < arr.length ; i++ ){
            if(arr[i] == 0 && prev == 0 ){
                if( i == (arr.length - 1)){
                    jump++;
                    break;
                }
                if(len == 2){
                   len = 1;
                   jump++;
               }
               else
                   len++;
            }
            if(arr[i] == 1 && prev == 0){
                if(len != 0)
                    jump++;
                len = 0;
            }
            if (arr[i] == 0 && prev == 1){
                jump++;
            }
            prev = arr[i];

            System.out.print(i);
            System.out.println(jump);
        }
        System.out.println(jump);
    }

}
