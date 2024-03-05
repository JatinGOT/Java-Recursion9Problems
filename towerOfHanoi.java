/**
 * towerOfHanoi
 */
public class towerOfHanoi {

    static void TOH(int n, String src, String helper, String des ){
        // Base Case 
         if (n==1) {
            System.out.println("Transer Disk " + n + " from " + src + " to "+ des);
            return ;
         }
        //  big Problem First Step
        TOH(n-1, src, des, helper);
        System.out.println("Transer Disk " + n + " from " + src + " to "+ des); // self work 
        //  big Problem First Step
        TOH(n-1, helper, src, des);


    }
    public static void main(String[] args) {
        int n = 3;
        TOH(n,"S","H","D");
    }
}