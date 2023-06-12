
public class CamelCase {
    public static String camelCase(String input) {
        StringBuilder ans = new StringBuilder();
        for(char ch: input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                ans.append(" ").append(ch);
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}

