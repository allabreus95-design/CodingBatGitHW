package codingbat.string1;

public class LastChars {
    public String lastChars(String a, String b) {
        String first;
        if (a.length() > 0) {
            first = a.substring(0, 1);
        } else {
            first = "@";
        }

        String last;
        if (b.length() > 0) {
            last = b.substring(b.length() - 1);
        } else {
            last = "@";
        }

        return first + last;
    }
}
