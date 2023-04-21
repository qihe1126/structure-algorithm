package com.qihe.algo;

public class BinarySearch {

    /**
     * 二分查找基础版
     *
     * @param array 数组
     * @param target 查找目标
     * @return 1未找到 >-1 是找到的数组下标
     */
    public static int binarySearchBasic(int[] array, int target) {
        int i = 0, j = array.length - 1;
        while (i <= j) {
            // if else if 执行次数
            // L 次 元素在最左边 执行L次 元素在右边 执行2*L次
            int m = (i + j) >>> 1;  //此处不用用 (i+j)/2 j的数值可能是Integer.MAX_VALUE
            if (target < array[m]) {
                j = m - 1; //目标在左边
            } else if (array[m] < target) {
                i = m + 1; //目标在右边
            } else {
                return m; //找到
            }
        }
        return -1;
    }

    /**
     * 二分查找改动版
     *
     * @param array 数组
     * @param target 查找目标
     * @return 1未找到 >-1 是找到的数组下标
     */
    public static int binarySearchAlternative(int[] array, int target) {
        int i = 0, j = array.length;
        while (i < j) {
            int m = (i + j) >>> 1;  //此处不用用 (i+j)/2 j的数值可能是Integer.MAX_VALUE
            if (target < array[m]) {
                j = m;
            } else if (array[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 二分查找平衡版
     *
     * @param array 数组
     * @param target 查找目标
     * @return 1未找到 >-1 是找到的数组下标
     */
    public static int binarySearchBalance(int[] array, int target) {
        int i = 0, j = array.length;
        while (1 < j - i) {
            int m = (i + j) >>> 1;  //此处不用用 (i+j)/2 j的数值可能是Integer.MAX_VALUE
            if (target < array[m]) {
                j = m;
            } else {
                i = m;
            }
        }
        if (array[i] == target) {
            return i;
        } else {
            return -1;
        }
    }

    /**
     * 二分查找最左侧位置
     *
     * @param array 数组
     * @param target 查找目标
     * @return 1未找到 >-1 是找到的数组下标
     */
    public static int binarySearchLeftMost(int[] array, int target) {
        int i = 0, j = array.length - 1;
        int condidate = -1;
        while (i <= j) {
            // if else if 执行次数
            // L 次 元素在最左边 执行L次 元素在右边 执行2*L次
            int m = (i + j) >>> 1;  //此处不用用 (i+j)/2 j的数值可能是Integer.MAX_VALUE
            if (target < array[m]) {
                j = m - 1; //目标在左边
            } else if (array[m] < target) {
                i = m + 1; //目标在右边
            } else {
                condidate = m;
                j = m - 1;
            }
        }
        return condidate;
    }


    /**
     * 二分查找最右侧位置
     *
     * @param array 数组
     * @param target 查找目标
     * @return 1未找到 >-1 是找到的数组下标
     */
    public static int binarySearchRightMost(int[] array, int target) {
        int i = 0, j = array.length - 1;
        int condidate = -1;
        while (i <= j) {
            // if else if 执行次数
            // L 次 元素在最左边 执行L次 元素在右边 执行2*L次
            int m = (i + j) >>> 1;  //此处不用用 (i+j)/2 j的数值可能是Integer.MAX_VALUE
            if (target < array[m]) {
                j = m - 1; //目标在左边
            } else if (array[m] < target) {
                i = m + 1; //目标在右边
            } else {
                condidate = m;
                i = m + 1;
            }
        }
        return condidate;
    }

    /**
     * 二分查找递归
     *
     * @param array
     * @param target
     * @return
     */
    public static int binarySearchRecursion(int[] array, int target) {
        return recursionSearch(array, target, 0, array.length - 1);
    }

    /**
     * 递归二分查找实现
     * @param array 数组
     * @param target 目标查询元素
     * @param left 左边界
     * @param right 有边界
     * @return -1未找到 >-1 是找到的数组下标
     */
    private static int recursionSearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int m = (left + right) >>> 1;
        if (target < array[m]) {
            return recursionSearch(array, target, left, m - 1);
        } else if (array[m] < target) {
            return recursionSearch(array, target, left + 1, right);
        } else {
            return m;
        }
    }


}
