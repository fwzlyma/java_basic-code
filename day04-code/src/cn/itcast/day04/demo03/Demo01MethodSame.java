package cn.itcast.day04.demo03;

/*
题目要求：
定义一个方法，用来判断两个数字是否相同。
*/
public class Demo01MethodSame {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        boolean result = isSame(a, b);
        printSame(result);
    }

    public static boolean isSame(int a, int b) {//方法使用小驼峰。
        /*if (a==b){
            return true;
        } else {
            return false;
        }*/
//        2.极简
        return a == b;
    }

    public static void printSame(boolean result) {
        if (result == true) {
            System.out.println("两数相等！");
        } else {
            System.out.println("两数不相等！");
        }
    }
}
