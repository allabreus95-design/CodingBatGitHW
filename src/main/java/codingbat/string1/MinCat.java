package codingbat.string1;

public class MinCat {
    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()).concat(b);
        }
        if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length());
        }
        if (a.length() == b.length()) {
            return a + b;
        }
        return "not this topic";
    }
}
