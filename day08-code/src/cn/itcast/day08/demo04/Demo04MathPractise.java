package cn.itcast.day08.demo04;

/*
【题目】
计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？

分析：
1.既然已经确定了范围，for循环
2.起点位置-10.8应该转换成为-10，两种方法：
    2.1 可以使用Math.ceil方法，向上（正方向）取整
    2.2 强转换成为int，自动舍弃所有小数位。
3.每一个数字都是整数，所以步进表达式应该是num++，这样每次+1
4.如何拿到绝对值：Math.abs()方法
5.一旦发现了一个数字，需要让计数器++进行统计
*/
public class Demo04MathPractise {
    public static void main(String[] args) {
        int num1 = numCount(-10.8,5.9);
        System.out.println("整数个数："+num1);
        int num2 = numCount2(-10.8,5.9);
        System.out.println("整数个数："+num2);
    }
    public static int numCount(double begin,double end){
        int num=0;
        int begin1 = (int)Math.ceil(begin);
        int end1 = (int)Math.floor(end);
        for (int i = begin1; i < end1; i++) {
            if(Math.abs(i)>6 || Math.abs(i)<2.1){
                System.out.println(i);
                num++;
            }
        }
        return num;
    }
    public static int numCount2(double begin,double end){
        int num = 0;
        for (int i = (int)begin; i < end; i++) {
            int j = Math.abs(i);
            if(j>6 || j<2.1){
                num++;
                System.out.print(i+" ");
            }
        }
        return num;
    }
}
