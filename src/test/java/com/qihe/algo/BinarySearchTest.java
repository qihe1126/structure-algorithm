package com.qihe.algo;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "二分查找测试")
public class BinarySearchTest {
    public BinarySearchTest() {
    }

    @Test
    @DisplayName(value = "basic找到")
    public void binarySearchBasicFound() {
        int[] array = {4, 8, 20, 33, 46, 57, 76, 91};
        Assert.assertEquals(1, BinarySearch.binarySearchBasic(array, 8));
        Assert.assertEquals(4, BinarySearch.binarySearchBasic(array, 46));
        Assert.assertEquals(7, BinarySearch.binarySearchBasic(array, 91));
    }

    @Test
    @DisplayName(value = "basic没找到")
    public void binarySearchBasicNoFound() {
        int[] array = {4, 8, 20, 33, 46, 57, 76, 91};
        Assert.assertEquals(-1, BinarySearch.binarySearchBasic(array, 9));
        Assert.assertEquals(-1, BinarySearch.binarySearchBasic(array, 1));
        Assert.assertEquals(-1, BinarySearch.binarySearchBasic(array, 99));
    }



    @Test
    @DisplayName(value = "alternative找到")
    public void binarySearchAlternativeFound() {
        int[] array = {4, 8, 20, 33, 46, 57, 76, 91};
        Assert.assertEquals(1, BinarySearch.binarySearchAlternative(array, 8));
        Assert.assertEquals(4, BinarySearch.binarySearchAlternative(array, 46));
        Assert.assertEquals(7, BinarySearch.binarySearchAlternative(array, 91));
    }

    @Test
    @DisplayName(value = "alternative没找到")
    public void binarySearchAlternativeNoFound() {
        int[] array = {4, 8, 20, 33, 46, 57, 76, 91};
        Assert.assertEquals(-1, BinarySearch.binarySearchAlternative(array, 9));
        Assert.assertEquals(-1, BinarySearch.binarySearchAlternative(array, 1));
        Assert.assertEquals(-1, BinarySearch.binarySearchAlternative(array, 99));
    }

    @Test
    @DisplayName(value = "recursion测试")
    public void binarySearchRecursionFound() {
        int[] array = {4, 8, 20, 33, 46, 57, 76, 91};
        Assert.assertEquals(1, BinarySearch.binarySearchRecursion(array, 8));
        Assert.assertEquals(4, BinarySearch.binarySearchRecursion(array, 46));
        Assert.assertEquals(7, BinarySearch.binarySearchRecursion(array, 91));

        Assert.assertEquals(-1, BinarySearch.binarySearchRecursion(array, 9));
        Assert.assertEquals(-1, BinarySearch.binarySearchRecursion(array, 1));
        Assert.assertEquals(-1, BinarySearch.binarySearchRecursion(array, 99));
    }
}