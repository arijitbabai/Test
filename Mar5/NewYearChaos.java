package Mar5;

public class NewYearChaos {
//    public static boolean isSorted(int[] arr){
//        for(int i = 1 ; i < arr.length ; i++){
//            if(arr[i-1] > arr[i])
//                return false;
//        }
//        return true;
//    }
    public static void main(String[] args) {
        int arr[] = {2 ,5 ,1 ,3 ,4};
        int len = arr.length;
        int turn[] = new int[len];//for counting the no. of swaps
        int swap;
        int count=0;
        boolean flag;
        int i,j;
        for( i = 0 ; i < len-1 ; i++) {
            flag = false;//for checking if the swapping is occurring or not
//            System.out.println(arr[i]);
            for(j = 0 ; j < len-i -1 ; j++){
                if (arr[j] > arr[j+1]) {//checking for swap
                    turn[arr[j] - 1]++;//counting the swap for the specific no.
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    count++;//counting the swap
                    flag = true;//set flag to trace the swap
                }
                if (turn[arr[j+1]-1] > 2) {//checking if ay no. has been swapped for more than 2 times and j+1 due too the swap
                    System.out.println("Too chaotic");//arrangement is not feasible as each member can't swap more than two times
                    return;
                }
            }
            if(flag == false)//if no swap break the loop
                break;
        }
//        for(i=0 ; i < len ;i++) System.out.println(turn[i]);
        System.out.println(count);//printing the no. of swap at the end
    }
}
