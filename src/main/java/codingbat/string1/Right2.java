package codingbat.string1;

public class Right2 {
    public String right2(String str) {
        return str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
    }
}
