package com.hvdbs.savra.datastructureandalgorithms.java.Math;

public class EuclideanAlgorithm {
    private static int euclideanAlgorithm(int dividend, int divider) {
        if (divider == 0) {
            return dividend;
        }

        return euclideanAlgorithm(divider, dividend % divider);
    }
}
