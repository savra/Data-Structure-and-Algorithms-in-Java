package com.hvdbs.savra.datastructureandalgorithms.java.search;

public class BinarySearchIterative {
    int binarySearch(int[] arr, int k) {
        int lo = 0;
        int ho = arr.length - 1;

        while (lo <= ho) {
            int m = lo + (ho - lo) / 2;

            if (k < arr[m]) {
                ho = m - 1;
            } else if (k > arr[m]) {
                lo = m + 1;
            } else {
                return m;
            }
        }

        return -1;
    }
}
