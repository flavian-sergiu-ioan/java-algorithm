package algorithms.median_sorted_array;

public class MedianSortedArraySolutionOne {

    public static void main(String[] args) {

        int [] a = new int[] {1, 2, 3, 4};
        int [] b = new int[] {1, 2, 3, 4};

        System.out.println(findMedianSortedArray(a, b));

    }

    public static double findMedianSortedArray(int[]A, int[]B) {
        int m = A.length;
        int n = B.length;

        if ((m+n) % 2 != 0) {
            return findKth(A, B, (m+n)/2 , 0, m-1, 0, n-1);
        } else {
            return (findKth(A, B, (m+n)/2 , 0, m-1, 0, n-1) +
                    findKth(A, B, (m+n)/2 -1 , 0, m-1, 0, n-1)) * 0.5;
        }
    }

    private static int findKth(int[] a, int[] b, int k, int aStart, int aEnd, int bStart, int bEnd) {
           int aLen = aEnd - aStart +1;
           int bLen = bEnd - bStart +1;

           if (aLen == 0) {
               return b[bStart+k];
           } else if (bLen == 0) {
               return a[aStart + k];
           } else if (k == 0) {
               return Math.min(a[aStart], b[bStart]);
           }

           int aMid = aLen * k / (aLen + bLen);
           int bMid = bLen * k / (aLen + bLen);

           aMid = aMid + aStart;
           bMid = bMid + bStart;

           if (a[aMid] > b[bMid]) {
               k = k - (bMid - bStart + 1);
               aEnd = aMid;
               bStart = bMid + 1;
           } else {
              k  = k - (aMid - aStart +1);
              bEnd = bMid;
              aStart = aMid +1;
           }

           return findKth(a, b, k, aStart, aEnd, bStart, bEnd);
    }
}
