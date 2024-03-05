public class moveAllX {
    static void addXLast(String str, int count, int idx, String newStr) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr+='x';
            }
            System.out.println(newStr);
            return;
            
        }

        char churChar = str.charAt(idx);
        if (churChar == 'x') {
            count++;
            addXLast(str, count, idx + 1, newStr);
        }
        else{
            newStr+=churChar;
            addXLast(str, count, idx+1, newStr);
        }

    }

    public static void main(String[] args) {
        String str = "axbxcxdx";
        addXLast(str, 0, 0, "");
    }
}
