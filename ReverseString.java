public class ReverseString {
    static void RS(String str, int idx) {
        // Base Case
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        RS(str, idx-1);
    }

        static String reverse(String s, int idx){
            if(idx == s.length()) return " ";

            String smallAns = reverse(s, idx+1);
            return smallAns + s.charAt(idx);
        }

    public static void main(String[] args) {
        String str = "hello";
        RS(str, str.length() - 1);
       System.out.println(reverse(str, 0)); 
    }
}
