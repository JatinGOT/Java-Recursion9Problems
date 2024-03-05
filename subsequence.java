public class subsequence {
    static void GetSS(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        // to be 
        GetSS(str, idx+1,  newStr+currentChar);
        // or not to be 
        GetSS(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        String str = "abc";
        GetSS(str, 0, "");
    }
}
