package codingbat.string1;

public class DeFront {
    public String deFront(String str) {
        if (str.length() <= 1) {
            return str.equals("a") ? "a" : "";
        }

        String result = "";

        if (str.charAt(0) == 'a') {
            result += str.charAt(0);
        }
        if (str.charAt(1) == 'b') {
            result += str.charAt(1);
        }

        return result + str.substring(2);
    }

}
