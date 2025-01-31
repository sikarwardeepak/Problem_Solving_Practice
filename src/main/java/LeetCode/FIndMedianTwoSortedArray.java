package LeetCode;

public class FIndMedianTwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median  = 0;
        int[] mergedArray = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;
        while (i<nums1.length && j<nums2.length) {
            if (nums1[i]<nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i<nums1.length) {
            mergedArray[k++] = nums1[i++];
        }

        while (j<nums2.length) {
            mergedArray[k++] = nums2[j++];
        }

        int n = mergedArray.length;
        if (n % 2 == 0) {
            median = (mergedArray[n/2-1] + mergedArray[n/2])/2.0;
        } else {
            median = mergedArray[n/2];
        }

        return median;
    }

    public static void main(String[] args) {
        FIndMedianTwoSortedArray obj = new FIndMedianTwoSortedArray();
        int[] nums1 = {1,2,3,10,20,30};
        int[] nums2 = {2,5,6};
        double median = obj.findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }
}
