package com.qihe.algo;

public class BobbleSort {

    /**
     * 冒泡排序
     *
     * @param array 数组
     */
    public static void sort(int[] array) {
        sort(array, array.length - 1);
    }

    private static void sort(int[] array, int rightBoundary) {
        if (rightBoundary == 0) {
            return;
        }
        int x = 0;
        for (int i = 0; i < rightBoundary; i++) {
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                x = i;
            }
        }
        sort(array, x);
    }


}
