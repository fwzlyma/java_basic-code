package cn.itcast.day07.demo01;

import java.util.Scanner;

/*
题目：键盘输入两个int数字，并且求和。
思路：
1.既然需要键盘输入，那么就用Scanner；
2.Scanner的三个步骤，导包、创建、使用
3.需要的是两个数字，所以要调用两次nextInt方法
4.得到了两个数字，就需要加在一起
5.将结果打印输出。
*/
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First:");
        int a = sc.nextInt();
        System.out.println("Second:");
        int b = sc.nextInt();
        System.out.println("Sum:" + (a + b));
    }
}
