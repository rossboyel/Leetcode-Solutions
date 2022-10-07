public class Reverse {

    public static int[] reverse(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = n-i;
        }

        return arr;
    }

}
