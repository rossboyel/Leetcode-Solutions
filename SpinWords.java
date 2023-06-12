public class SpinWords {
    
    public static String spinWords(String input) {
        String[] arr = input.split(" ");

        for(int i = 0; i<arr.length; i++) {
            if (arr[i].length() >= 5) {
                String ans = new StringBuffer(arr[i]).reverse().toString();
                arr[i] = ans;
            }
        }
        return String.join(" ", arr);
}
    

    public static void main(String[] args) {
        System.out.println(spinWords( "Hey fellow warriors" ));
        spinWords("Welcome");
        spinWords( "Hey fellow warriors" ); // => returns "Hey wollef sroirraw"
        spinWords( "This is a test"); // => returns "This is a test"
        spinWords( "This is another test" ); //=> returns "This is rehtona test"
    }
}

