package com.qihe.algo;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "二分查找测试")
public class BinarySearchTest {
    public BinarySearchTest() {
    }

    @Test
    @DisplayName(value = "找到")
    public void binarySearchBasicFound() {
        int[] array = {4, 8, 20, 33, 46, 57, 76, 91};
        Assert.assertEquals(1, BinarySearch.binarySearchBasic(array, 8));
    }

    @Test
    @DisplayName(value = "没找到")
    public void binarySearchBasicNoFound() {
        int[] array = {4, 8, 20, 33, 46, 57, 76, 91};
        Assert.assertEquals(-1, BinarySearch.binarySearchBasic(array, 9));
    }
}