package codingbat.string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        if (str.length() >= 2 && str.length() % 2 == 0) {
            int num = str.length()/2;
            return str.substring(num -1,num + 1);
        } else {
            return "not even length";
        }
    }
}
