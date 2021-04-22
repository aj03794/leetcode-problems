import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {

//    public int maxArea(int[] height) {
//
//        var midPoint = height.length/2;
//        var largestLeftSideIndex = 0;
//        var leftSideSize = 0;
//        var largestRightSideIndex = 0;
//        var rightSideSize = 0;
//
//        for (int i = 0; i < height.length; i++) {
//            // Before midway point of array
//            if (i < midPoint) {
//                var currentSize = height[i] * (height.length - i - 1);
//                if (i == 0) {
//                    leftSideSize = currentSize;
//                } else if (currentSize > leftSideSize) {
//                    largestLeftSideIndex = i;
//                    leftSideSize = currentSize;
//                }
//            } else {
//                System.out.println(height[i] * i);
//                var currentSize = height[i] * i;
//                if (i == midPoint) {
//                    rightSideSize = currentSize;
//                    largestRightSideIndex = i;
//                } else if (currentSize > rightSideSize
////                        && height[i] <= height[largestLeftSideIndex]
//                        )
//                {
//                    largestRightSideIndex = i;
//                    rightSideSize = currentSize;
//                }
//            }
//        }
//
//        System.out.println("Left index: " + largestLeftSideIndex + ", Left Area: " + leftSideSize);
//        System.out.println("Right index: " + largestRightSideIndex + ", Left Area: " + rightSideSize);
//
//        // Get initial calculations
//        var width = largestRightSideIndex - largestLeftSideIndex;
//        var length = Math.min(height[largestLeftSideIndex], height[largestRightSideIndex]);
//        var area = width * length;
//
//        // Need to backtrack on the left side of the array because
//        // the extra height on the left side will be discounted because the right side is shorter
//        // We can get more area using a greater width
//        if(height[largestLeftSideIndex] > height[largestRightSideIndex]) {
//            for (int i = 0; i <= largestLeftSideIndex - 1; i++) {
//                width = largestRightSideIndex - i;
//                length = Math.min(height[i], height[largestRightSideIndex]);
//
//                // other width
//                var otherWidth = largestLeftSideIndex - i;
//                var otherHeight = Math.min(height[i], height[largestLeftSideIndex]);
//                var otherArea = otherWidth * otherHeight;
//
//
//                var tempArea = width * length;
//                if (tempArea > area) {
//                    area = tempArea;
//                }
//                if (otherArea > area) {
//                    area = otherArea;
//                }
//            }
//        }
//        else {
//            for (int i = largestRightSideIndex + 1; i <= height.length - 1; i++) {
//                width = i - largestLeftSideIndex;
//                length = Math.min(height[largestLeftSideIndex], height[i]);
//
//                // other width
//                var otherWidth = i - largestRightSideIndex;
//                var otherHeight = Math.min(height[i], height[largestRightSideIndex]);
//                var otherArea = otherWidth * otherHeight;
//
//                var tempArea = width * length;
//                if (tempArea > area) {
//                    area = tempArea;
//                }
//                if (otherArea > area) {
//                    area = otherArea;
//                }
//            }
//        }
//
//        return area;
//    }

    public int maxArea(int[] height) {

        var midPoint = height.length/2;
        var currentLargestArea = 0;
        var indexThatMakesCurrentLargestArea = 0;
        for (int i = 0; i <= height.length - 1; i++) {
            var tempArea = 0;
            if (i < midPoint) {
                tempArea = height[i] * (height.length - i - 1);
            } else {
                tempArea = height[i] * i;
            }
            // Should we use next index if the areas are equal
            if (tempArea > currentLargestArea) {
                currentLargestArea = tempArea;
                indexThatMakesCurrentLargestArea = i;
            }
        }

        var actualLargestArea = 0;

        // look to the left to see what the largest size is
        for (int i = indexThatMakesCurrentLargestArea - 1; i >= 0; i--) {
            var length = indexThatMakesCurrentLargestArea - i;
            var _height = Math.min(height[i], height[indexThatMakesCurrentLargestArea]);
            var tempArea = length * _height;
            if (tempArea > actualLargestArea) {
                actualLargestArea = tempArea;
            }
        }

        System.out.println("--------------------");
        // look to the right to see what the largest size is
        for (int i = indexThatMakesCurrentLargestArea + 1; i <= height.length - 1; i++) {
            var length = i - indexThatMakesCurrentLargestArea;
            var _height = Math.min(height[i], height[indexThatMakesCurrentLargestArea]);
            var tempArea = length * _height;
            if (tempArea > actualLargestArea) {
                actualLargestArea = tempArea;
            }
        }

        System.out.println(indexThatMakesCurrentLargestArea);
        System.out.println(currentLargestArea);

        return actualLargestArea;
    }

}
