public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the last element of nums1 and nums2
        int i = m - 1; // Last element in the original nums1
        int j = n - 1; // Last element in nums2
        int k = m + n - 1; // Last index in nums1 (after merging)

        // Merge nums2 into nums1 from the end to the start
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are any remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
