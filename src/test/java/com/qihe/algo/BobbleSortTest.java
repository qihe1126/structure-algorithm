package com.qihe.algo;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "冒泡排序测试")
public class BobbleSortTest {
    public BobbleSortTest() {
    }

    @Test
    @DisplayName(value = "冒泡排序")
    public void bobbleSort() {
        int[] array = {5, 1, 9, 6, 88, 33, 44, 22, 11, 91};
        int[] array2 = {1, 5, 6, 9, 11, 22, 33, 44, 88, 91};
        BobbleSort.bobbleSort(array);
        Assert.assertArrayEquals(array2, array);
    }

}