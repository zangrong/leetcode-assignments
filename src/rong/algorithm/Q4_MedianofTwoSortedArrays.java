/**
 * @ClassName MedianofTwoSortedArrays
 */
package rong.algorithm;

/**
 * @ClassName MedianofTwoSortedArrays
 * @Description TODO
 */
public class Q4_MedianofTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int nums1i = 0;
        int nums2i = 0;
        int middlei1 = (len % 2 != 0) ? (len / 2) : (len / 2 - 1);
        int middlei2 = len / 2;
        int m1 = 0;
        int m2 = 0;
        for (int i = 0; i <= len / 2; i++) {
            int temp = 0;
            if (nums1i == nums1.length) {
                temp = nums2[nums2i];
                nums2i++;
            } else if (nums2i == nums2.length) {
                temp = nums1[nums1i];
                nums1i++;
            } else if (nums1[nums1i] <= nums2[nums2i]) {
                temp = nums1[nums1i];
                nums1i++;
            } else {
                temp = nums2[nums2i];
                nums2i++;
            }
            if (i == middlei1) {
                m1 = temp;
            }
            if (i == middlei2) {
                m2 = temp;
            }
        }
        return (double) (m1 + m2) / 2;
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }

}
