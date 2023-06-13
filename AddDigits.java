public class AddDigits {

    public int addDigits(int num) {
        int j = 0;
        if(num < 10) {
            return num;
        }  else {
            char[] digits = String.valueOf(num).toCharArray();
            for(char c: digits) {
                j += c - '0';
            }
            return addDigits(j);
        }
    }
}
