/**
 * isSorted
 */
public class isSorted {

    static boolean sort(int arr[], int idx){
        // base case 
        if(idx == arr.length-1)
         return true;

         if(arr[idx]>arr[idx+1]) 
         return false;

          return sort(arr, idx+1);

    }
    public static void main(String[] args) {
        int arr[]={12,2,3,4,6};
      System.out.println( sort(arr, 0));
    }
}