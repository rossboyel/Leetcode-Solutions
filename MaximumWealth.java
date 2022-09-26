import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumWealth {

    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> count = new ArrayList<>();

        for(int[] i : accounts) { //get each account
            int c = Arrays.stream(i).sum();
            count.add(c);
        }

        return Collections.max(count);
    }
}

