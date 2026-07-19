package codingbat.string1;

public class WwithoutX {
    public String withoutX(String str) {
        if (str.length() == 0) return str;
        if (str.length() == 1) return "";

        if (str.startsWith("x") && str.endsWith("x")) {
            return str.substring(1, str.length() - 1);
        }
        if (str.startsWith("x")) {
            return str.substring(1);
        }
        if (str.endsWith("x")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }
}
