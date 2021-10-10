package cn.itcast.day08.demo02;

import java.util.Scanner;

/*
【题目】
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其他

【思路】
1.既然用到键盘输入，肯定是Scanner
2.键盘输入的是字符串，那么：String str = sc.next();
3.定义四个遍历,分别代表四种字符各自出现次数。
4.需要对字符串一个字、一个字检测，String-->char[],方法就是toCharArray();
5.遍历char[]字符数字，对当前字符的种类进行判断，并且用四个变量进行++动作
6.打印输出四个变量，分别代表四种字符出现次数。
*/
public class Demo07StringCount {
    public static void main(String[] args) {
        test();
        /*
        ctrl+ shift+ r：批量替换。
        */
    }
    public static void test(){
        int[] zifu1 = statistic();
        for (int i = 0; i < zifu1.length; i++) {
            switch (i){
                case 0:
                    System.out.print("大写字母个数：");
                    System.out.println(zifu1[0]);
                    break;
                case 1:
                    System.out.print("小写字母个数：");
                    System.out.println(zifu1[1]);
                    break;
                case 2:
                    System.out.print("数字个数：");
                    System.out.println(zifu1[2]);
                    break;
                case 3:
                    System.out.print("其他个数：");
                    System.out.println(zifu1[3]);
                    break;
                default:
                    break;
            }
        }
    }
    public static int[] statistic() {
        int[] zifu = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("统计字符串开始...");
        System.out.println("请输入字符串：");
        //获取键盘输入的字符串：
        String str = sc.next();
        //将输入的字符串转换为字符串数组：
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch >= '0' && ch <= '9') {
                zifu[2] += 1;
            } else if (ch >= 'A' && ch <= 'Z') {
                zifu[0] += 1;
            } else if (ch >= 'a' && ch <= 'z') {
                zifu[1] += 1;
            } else {
                zifu[3] += 1;
            }
        }
        return zifu;
    }
}
