package codingbat.string1;

public class MiddleThree {
    public String middleThree(String str) {
        if (str.length() >= 3 && str.length() % 2 != 0) {
            int num = str.length() / 2;
            return str.substring(num -1,num + 2);
        } else {
            return "not even length";
        }
    }
}
