package cn.itcast.day08.demo04;

/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs(double num):获取绝对值。
public static double ceil(double num):向上取整。
public static double floor(double num):向下取整。
public static long round(double num):四舍五入。

Math.PI代表近似的圆周率(double)
*/
public class Demo03Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));//3.14
        System.out.println(Math.abs(0));//0
        System.out.println(Math.abs(-3.14));//3.14

        //向上取整
        System.out.println(Math.ceil(3.9));//4.0
        System.out.println(Math.ceil(3.1));//4.0
        System.out.println(Math.ceil(3.0));//3.0

        //向下取整,抹零
        System.out.println(Math.floor(30.1));//30.0
        System.out.println(Math.floor(30.9));//30.0
        System.out.println(Math.floor(31.0));//31.0

        //四舍五入--结果不带小数点
        System.out.println(Math.round(3.5));//4
        System.out.println(Math.round(3.4));//3
    }
}
