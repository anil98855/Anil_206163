public class MedianOfAnArray {


        public static double findMedian(int[] arr1, int[] arr2) {
            int[] merged = new int[arr1.length + arr2.length];
            int i = 0, j = 0, k = 0;


            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    merged[k++] = arr1[i++];
                } else {
                    merged[k++] = arr2[j++];
                }
            }


            while (i < arr1.length) {
                merged[k++] = arr1[i++];
            }
            while (j < arr2.length) {
                merged[k++] = arr2[j++];
            }


            int n = merged.length;
            if (n % 2 == 1) {
                return merged[n / 2];
            } else {
                return (merged[(n / 2) - 1] + merged[n / 2]) / 2.0;
            }
        }

        public static void main(String[] args) {
            int[] arr1 = {2, 3, 5, 8};
            int[] arr2 = {10, 12, 14, 16, 18,};

            double median = findMedian(arr1, arr2);
            System.out.println("Median is: " + median);
        }
    }


