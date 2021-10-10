package cn.itcast.day04.demo04;

/*题目要求：
比较两个数据是否相等。
参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型。
并在main方法中进行测试。
*/
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        /*parameters define*/
        byte a1 = 10, b1 = 20;
        short a2 = 8, b2 = 8;
        int a3 = 10, b3 = 10;
        long a4 = 30, b4 = 40;
        /*Loop for different function*/
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    if (isSame(a1, b1)) {
                        System.out.println("相等");
                    } else {
                        System.out.println("不相等");
                    }
                    break;
                case 1:
                    if (isSame(a2, b2)) {
                        System.out.println("相等");
                    } else {
                        System.out.println("不相等");
                    }
                    break;
                case 2:
                    if (isSame(a3, b3)) {
                        System.out.println("相等");
                    } else {
                        System.out.println("不相等");
                    }
                    break;
                case 3:
                    if (isSame(10L, 20L)) {
                        System.out.println("相等");
                    } else {
                        System.out.println("不相等");
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("Here is byte func!");
        return a == b;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("Here is short func!");
        return a == b;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("Here is int func!");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("Here is long func!");
        return a == b;
    }

    /*练习二*/
    /*public static void OPEN(){
        return;
    }
    public static void open(){
        return;
    }*///不正确重载！
}


