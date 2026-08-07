package Day5;

public class Linear_Search {

    static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;   // Return index
            }
        }

        return -1;          // Element not found
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 40;

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}