package Q334;

/**
 * Created by Kry·L on 2018/3/4.
 */
public class Solution {
    public String reverseString(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= s.length(); i++) {
            builder.append(s.charAt(s.length()-i));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.reverseString("hello");
        System.out.println(result);
    }
}
