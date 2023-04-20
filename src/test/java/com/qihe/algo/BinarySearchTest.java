package com.qihe.algo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class BinarySearchTest {

    @Test
    @DisplayName("找到")
    public void binarySearchBasicTest() {
        int[] array = {4, 8, 20, 33, 46, 57, 76, 91};
        Assert.assertEquals(1, BinarySearch.binarySearchBasic(array, 8));
    }
}