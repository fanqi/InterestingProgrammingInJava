package xyz.fanqi.ch01chart;

import java.util.Scanner;

/**
 * 打印金字塔图案
 * Created by fanqi on 15/11/30.
 */
public class Pyramid {
    public static void main(String[] args) {
        System.out.println("请输入金字塔的层数:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (i - 1) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
