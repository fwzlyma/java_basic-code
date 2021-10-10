package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/*
【题目】
用代码模拟猜数字的小游戏。
思路：
1.首先需要产生一个随机数字，并且一旦产生就不再变化。用Random的nextInt()方法
2.需要键盘输入，用到了Scanner
3.获取键盘输入的数字，用Scanner当中的nextInt方法
4.已经得到了两个数字，判断（if）一下：
    如果太大了，提示，并且重试；
    如果太小了，提示，并且重试；
    如果猜中了，游戏结束。
5.重试就是再来一次，循环次数不确定，用while
*/
public class Demo04RandomGame {
    public static void main(String[] args) {
        Scanner sc = scannerReturn();
        Random r = new Random();
        int ans = r.nextInt(101);//0-100
        numGuess(ans, sc);
    }

    public static void numGuess(int ans, Scanner sc) {
        System.out.println("游戏开始");
        System.out.println("=========================");
        System.out.print("输入你猜的数字：");
        int num = sc.nextInt();
        if (num != ans) {
            while (true) {
                if (num > ans) {
                    System.out.print("猜大了！请再猜一次吧：");
                    num = sc.nextInt();
                } else if (num < ans) {
                    System.out.print("猜小了！请再猜一次吧：");
                    num = sc.nextInt();
                } else {
                    System.out.println("猜对啦！恭喜你！");
                    break;
                }
            }
        } else {
            System.out.println("一次就猜中了，恭喜你！");
        }
        System.out.println("=========================");
        System.out.println("游戏结束");
    }

    public static Scanner scannerReturn() {
        return new Scanner(System.in);
    }
}
