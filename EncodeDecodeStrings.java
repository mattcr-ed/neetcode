import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("lint");
        s.add("code");
        s.add("love");
        s.add("you");
        System.out.println(encode(s));

        System.out.println(decode(encode(s)));
    }

    public static String encode(List<String> strs) {
        StringBuilder sout = new StringBuilder();
        for (String s : strs) {
            sout.append(s).append(":;");
        }
        return String.valueOf(sout);
    }

    public static List<String> decode(String str) {
        List<String> stringList = new ArrayList<>();
        StringBuilder nString = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ':' && str.charAt(i) == ';') {
                nString.deleteCharAt(nString.length() - 1);
                stringList.add(String.valueOf(nString));
                nString = new StringBuilder();
            } else {
                nString.append(str.charAt(i));
            }
        }
        return stringList;
    }
}
