//package Day4;
//
//public class Sliding_Window {
//
//    static boolean SlidingWindow(int[] arr, int k, int target) {
//
//        int ws = 0;
//
//        // First window
//        for (int i = 0; i < k; i++) {
//            ws += arr[i];
//        }
//
//        if (ws == target) {
//            return true;
//        }
//
//        // Slide window
//        for (int i = k; i < arr.length; i++) {
//
//            ws = ws - arr[i - k] + arr[i];
//
//            // Check every window
//            if (ws == target) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//
//        int k = 3;
//        int target = 18;
//
//        boolean result = SlidingWindow(arr, k, target);
//
//        System.out.println(result);
//    }
//}

package Day4;

import java.util.Arrays;

public class Sliding_Window {

    static int[] SlidingWindow(int[] arr, int k, int target) {

        int ws = 0;

        // First window
        for (int i = 0; i < k; i++) {
            ws += arr[i];
        }

        // Check first window
        if (ws == target) {
            return new int[]{0, k - 1};
        }

        // Slide window
        for (int i = k; i < arr.length; i++) {

            ws = ws - arr[i - k] + arr[i];

            if (ws == target) {
                return new int[]{i - k + 1, i};
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int k = 3;
        int target = 18;

        int[] result = SlidingWindow(arr, k, target);

        System.out.println(Arrays.toString(result));
    }
}