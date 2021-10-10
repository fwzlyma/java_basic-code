package cn.itcast.day07.demo01;

import java.util.Scanner;
/*
【题目】
键盘输入三个int数字，然后求出其中的最大值

思路：
1.既然是键盘输入，肯定要用到Scanner；
2.Scanner三个步骤：导包、创建、使用nextInt();
3.既然是三个数字，那么调用三次nextInt()方法，得到三个int变量
4.无法同时判断三个数字谁最大，应该转化成为两个步骤；
    4.1 首先判断前两个谁大，拿到前两个的最大值
    4.2 拿着前两个最大值，和第三个数字比较，得到三个数字的最大值。
5.打印最终结果。
*/
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("请输入数组元素：");
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }
        int max = max(array);
        System.out.println("最大值是："+max);
    }
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
