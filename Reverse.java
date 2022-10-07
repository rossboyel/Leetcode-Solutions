public class Reverse {

    public static int[] reverse(int n) {

        int[] arr = new int[n];

        for (int d = 0; d < n; d++) {
            arr[d] = n-d;
        }

        return arr;
    }

}
