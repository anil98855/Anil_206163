public class MissingElement {
    public static int findMin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // If the subarray is already sorted, the first element is the minimum
            if (arr[left] < arr[right]) {
                return arr[left];
            }

            int mid = left + (right - left) / 2;

            // Check which half contains the minimum
            if (arr[mid] >= arr[left]) {
                // Minimum must be in the right half
                left = mid + 1;
            } else {
                // Minimum is in the left half (including mid)
                right = mid;
            }
        }

        return arr[left];  // or arr[high], both are same here
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4,0};
        int[] arr3 = {3, 4, 5, 1, 2};

        System.out.println("Min in arr1: " + findMin(arr1));  // Output: 1
        System.out.println("Min in arr2: " + findMin(arr2));  // Output: 1
        System.out.println("Min in arr3: " + findMin(arr3));  // Output: 1
    }

}
