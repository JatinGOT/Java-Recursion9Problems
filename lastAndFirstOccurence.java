public class lastAndFirstOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void FO(String str, int idx, String element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        String currentChar = "a";
        if (currentChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        FO(str, idx+1, element);

    }

    public static void main(String[] args) {

        String str = "abaaldaefaah";
        FO(str, 0, "a");
    }
}
