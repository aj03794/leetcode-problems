import java.util.ArrayList;
import java.util.Collections;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        var largest = new ArrayList<Integer>();
        var current = new ArrayList<Integer>();
        var largestSum = 0;
        int sum = 0;
        for (int i=0; i < nums.length; i++) {
            if (current.isEmpty()) {
                current.add(nums[i]);
                sum+=nums[i];
                if (sum > largestSum || i == 0) {
                    largestSum = sum;
                }
            } else {
                var tempSum = sum + nums[i];
                if (tempSum > 0) {
                    current.add(nums[i]);
                    sum+=nums[i];
                    if (sum > largestSum) {
                        largestSum = sum;
                    }
                } else {
                    if (nums[i] >= sum) {
                        largest.clear();
                        current.clear();
                        current.add(nums[i]);
                        largest.addAll(current);
                        sum = nums[i];
                        if (sum > largestSum) {
                            largestSum = sum;
                        }
                    } else {
                        current.clear();
                        if (sum > largestSum) {
                            largestSum = sum;
                        }
                        sum = 0;
                    }
                }
            }
        }

        return largestSum;
    }
}
