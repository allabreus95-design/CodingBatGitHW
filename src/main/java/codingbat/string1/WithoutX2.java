package codingbat.string1;

public class WithoutX2 {
    public String withoutX2(String str) {
        if (str.length() < 1) {
            return str;
        }
        if (str.startsWith("xx")) {
            return str.substring(2);
        }
        if (str.substring(0, 1).contains("x")) {
            return str.substring(1);
        } else if (str.substring(1, 2).contains("x")) {
            return str.substring(0, 1).concat(str.substring(2));
        } else {
            return str;
        }
    }

}
