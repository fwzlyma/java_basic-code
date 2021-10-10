package cn.itcast.day05.demo.demo04;

/*
一个方法可以有0、1、多个参数，但是只能有0或1个返回值，不能有多个返回值。
如果希望一个方法当中产生了多个结果数据进行返回，怎么办？
解决方案：使用一个数组作为返回值类型即可。
*/
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] returnA = calculate(1, 2, 3);
        System.out.println("总和：" + returnA[0]);
        System.out.println("平均值：" + returnA[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg};
        return array;
    }
}
