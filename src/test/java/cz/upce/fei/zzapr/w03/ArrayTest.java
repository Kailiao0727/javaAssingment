package cz.upce.fei.zzapr.w03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

    @Test
    void sumArraysEqualLength() {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        int[] expectedSum = {5, 7, 9};
        assertArrayEquals(expectedSum, Array.sumArrays(firstArray, secondArray));
    }

    @Test
    void sumArraysDifferentLength() {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6, 7};
        assertNull(Array.sumArrays(firstArray, secondArray));
    }

    @Test
    void sumArraysEmpty() {
        int[] firstArray = {};
        int[] secondArray = {};
        int[] expectedSum = {};
        assertArrayEquals(expectedSum, Array.sumArrays(firstArray, secondArray));
    }
}