
public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        if(names.length == 0 || names[0].equals("")) {
            return "no one likes this";
        } else if(names.length == 1) {
            return names[0] + " likes this";
        } else if(names.length ==2) {
            return names[0] +" and " + names[1] + " like this";
        } else if(names.length ==3) {
            return names[0] +", " + names[1] +" and " + names[2] +  " like this";
        } else {
            return names[0] + ", " + names[1] +" and " + (names.length-2) + " others like this";
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt(""));
        System.out.println(whoLikesIt("mike"));
        System.out.println(whoLikesIt("ross", "jess"));
        System.out.println(whoLikesIt("rob", "narco", "fraz"));
        System.out.println(whoLikesIt("rob", "narco", "fraz", " roas"));
    }
}
