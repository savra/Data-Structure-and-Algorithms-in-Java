package com.hvdbs.savra.datastructureandalgorithms.java.Math;

import org.springframework.util.Assert;

public class EuclideanAlgorithm {
    private static int euclideanAlgorithm(int dividend, int divider) {
        if (divider == 0) {
            return dividend;
        }

        return euclideanAlgorithm(divider, dividend % divider);
    }

    public static void main(String[] args) {
        Assert.isTrue(euclideanAlgorithm(106,16) == 2, "Assertion error");
        Assert.isTrue(euclideanAlgorithm(108,72) == 36, "Assertion error");
        Assert.isTrue(euclideanAlgorithm(44,60) == 4, "Assertion error");
    }
}
