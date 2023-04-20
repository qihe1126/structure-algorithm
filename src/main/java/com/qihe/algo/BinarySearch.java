package com.qihe.algo;

public class BinarySearch {

    /**
     * 二分查找基础版
     * @param array
     * @param target
     * @return
     */
    public static int binarySearchBasic(int[] array, int target) {
        int i = 0, j = array.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;  //此处不用用 (i+j)/2 j的数值可能是Integer.MAX_VALUE
            if (target < array[m]) {
                j = m - 1;
            } else if (array[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
