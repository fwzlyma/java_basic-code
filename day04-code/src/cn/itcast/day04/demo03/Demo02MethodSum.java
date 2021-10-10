package cn.itcast.day04.demo03;

/*题目要求：
定义一个方法，用来求出1-100之间所有数字的和值。
*/
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("1-100之间的所有数字和值：" + hundredSum());
    }

    public static int hundredSum() {
        int result = 0;
        for (int i = 0; i < 100; ) {
            result += ++i;
        }
        return result;
    }
}
