package cn.itcast.day04.demo03;

/*
使用方法的时候注意事项：
1.方法应该定义在类当中，但是不能在方法当中再定义方法。不能嵌套
2.方法定义的前后顺序无所谓
3.方法定义之后不会执行，如果希望执行，一定要调用，单独调用、打印调用、赋值调用
4.如果方法有返回值，必须写上return
5.return后面的返回值类型必须和方法一致。
6.对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己。
7.对于void方法当中最后一行的return可以省略不写。
8.一个方法当中可以有多个return语句，但是必须保证同时只有 一个会被执行。两个不能连写。
*/
public class Demo04MethodNotice {
    public static void main(String[] args) {

    }

    public static int method1() {
        return 10;
    }

    public static void method2() {
//        return 10;//错误的写法！方法没有返回值，return后面就不能写返回值。
        return;
    }

    public static void method3() {
        System.out.println("AAA");
        System.out.println("BBB");
//        return;//可以省略。
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
