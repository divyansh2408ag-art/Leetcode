
import java.util.*;

class Solution {
    public int dsum(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] a = new int[n][3];

        for (int i = 0; i < n; i++) {
            a[i][0] = nums[i];
            a[i][1] = dsum(nums[i]);
            a[i][2] = i;
        }

        Arrays.sort(a, (x, y) -> {
            if (x[1] != y[1])
                return Integer.compare(x[1], y[1]);
            return Integer.compare(x[0], y[0]);
        });

        boolean[] v = new boolean[n];
        int f = 0;

        for (int i = 0; i < n; i++) {
            if (v[i] || a[i][2] == i)
                continue;

            int j = i, c = 0;

            while (!v[j]) {
                v[j] = true;
                j = a[j][2];
                c++;
            }

            f += c - 1;
        }

        return f;
    }
}
