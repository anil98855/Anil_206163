public class TargetInSortedArray {


        public static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2; // Corrected mid calculation

                if (nums[mid] == target) {
                    return mid;
                }

                // Determine if the left half is sorted
                if (nums[left] <= nums[mid]) {
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1; // Search the left half
                    } else {
                        left = mid + 1; // Search the right half
                    }
                } else {
                    // The right half must be sorted
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1; // Search the right half
                    } else {
                        right = mid - 1; // Search the left half
                    }
                }
            }

            return -1; // If the target is not found
        }

        public static void main(String[] args)
        {

            int arr[]={2,4,5,7,8,0,1};
            int target =1;
            System.out.println(search(arr,target));
        }
    }


