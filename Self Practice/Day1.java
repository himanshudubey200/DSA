public class Day1 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m + n];

        int i = 0, j = 0, idx = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[idx++] = nums1[i++];
            } else {
                temp[idx++] = nums2[j++];
            }
        }

        while (i < m) {
            temp[idx++] = nums1[i++];
        }

        while (j < n) {
            temp[idx++] = nums2[j++];
        }

        for (int x = 0; x < m + n; x++) {
            nums1[x] = temp[x];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
