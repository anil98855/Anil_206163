public class SumOfArrayOfInteger {


        public static int shortestSubArray(int[] arr, int K) {
            int minLen = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {
                int sum = 0;

                for (int j = i; j < arr.length; j++) {
                    sum += arr[j];

                    if (sum == K) {
                        int len = j - i + 1;
                        if (len < minLen) {
                            minLen = len;
                        }
                        break; // Found the shortest from i
                    }
                }
            }

            return (minLen == Integer.MAX_VALUE) ? -1 : minLen;
        }

        public static void main(String[] args) {
            int[] arr1 = {2, 4, 6, 10, 2, 1};
            int K1 = 12;
            System.out.println(shortestSubArray(arr1, K1)); // Output: 2

            int[] arr2 = {5, 8, 50, 4};
            int K2 = 50;
            System.out.println(shortestSubArray(arr2, K2)); // Output: 1
        }
    }

