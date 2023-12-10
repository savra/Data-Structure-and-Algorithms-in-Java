package com.hvdbs.savra.datastructureandalgorithms.java.search;

public class BinarySearchRecursive {
    int binarySearch(int[] source, int target, int left, int right) {
        if (left >= right) {
            return -1;
        }

        int m = left + (right - left) / 2;

        if (source[m] == target) {
            return m;
        }

        return target > source[m] ? binarySearch(source, target, m + 1, right) : binarySearch(source, target, left, m - 1);
    }
}
