package xyz.fanqi.ch01chart;

/**
 * 九九乘法表
 * Created by fanqi on 15/11/30.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(String.format("%d*%d=%d\t", i, j, i * j));
            }
            System.out.println();
        }
    }
}
