package xyz.fanqi.ch01chart;

import java.util.Scanner;

/**
 * 杨辉三角
 * Created by fanqi on 15/11/30.
 */
public class YanghuiTriangle {
    public static void main(String[] args) {
        System.out.println("请输入行数:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = getYanghuiTriangle(n);
        System.out.println("杨辉三角:");
        printYanghuiTriangle(arr, false);
        System.out.println("等腰杨辉三角:");
        printYanghuiTriangle(arr, true);

    }

    private static int[][] getYanghuiTriangle(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) arr[i][j] = 1;//竖边为1
                if (j == i) arr[i][j] = 1;//斜边为1
                if (j > 0 && j < i)//三角形中的数字等于其正上方数字及左上方数字之和
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        return arr;
    }

    private static void printYanghuiTriangle(int[][] arr, boolean isSosceles) {
        for (int i = 0; i < arr.length; i++) {
            if (isSosceles) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    System.out.print("\t");
                }
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]);
                System.out.print(isSosceles ? "\t\t" : "\t");
            }
            System.out.println();
        }
    }

}
