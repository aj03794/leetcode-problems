import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClimbStairs {

    int combinations = 0;
    HashMap<Integer, Integer> memo = new HashMap<>();

    // Naive solution

    public int climbStairs(int n) {
        var res = calculate(n, n);
        return res;
    }

    private int calculate(int i, int n) {
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            return 0;
        }
        if (memo.containsKey(i)) {
            return memo.get(i);
        }
        var res = calculate(i-1, n);
        res += calculate(i-2, n);
        memo.put(i, res);
        return memo.get(i);
    }
}
