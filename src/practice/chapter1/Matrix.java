package practice.chapter1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Matrix {
    /**
     * 矩阵转置
     *
     * @param source 原矩阵
     * @return 转置后的矩阵
     */
    static double[][] transpose(double[][] source) {
        if (source.length == 0) return new double[0][];

        double[][] covert = new double[source[0].length][source.length];

        for (int i = 0; i < covert.length; i++) {
            for (int j = 0; j < covert[i].length; j++) {
                covert[i][j] = source[j][i];
            }
        }
        return covert;
    }

    /**
     * 向量点乘
     * https://blog.csdn.net/liuxiao723846/article/details/88364208
     *
     * @param a
     * @param b
     * @return
     */
    static double dot(double[] a, double[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("向量长度必须相等");
        }

        double res = 0;
        for (int i = 0; i < a.length; i++) {
            res += a[i] * b[i];
        }

        return res;
    }

    public static void main(String[] args) {
        double[][] source = {{1, 2, 3, 4}, {4, 5, 6, 7}, {8, 9, 10, 11}};
        double[][] covert = transpose(source);
        for (double[] item : covert) {
            StdOut.println(Arrays.toString(item));
        }
    }
}
