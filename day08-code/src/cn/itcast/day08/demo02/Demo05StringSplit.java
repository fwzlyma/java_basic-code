package cn.itcast.day08.demo02;

/*
分割字符串的方法：
public String[] split(String regex):按照参数的规则，将字符串切分成为若干部分。
【注意事项】
split方法的参数其实是一个“正则表达式”。今后学习。
今天要注意的是：如果按照英文句点"."进行切分必须写"\\."(两个反斜杠。)
*/
public class Demo05StringSplit {
    public static void main(String[] args) {
        //待分割字符串
        String str1 = "aaa,bbb,ccc";
        //使用分割函数。
        String[] array1 = str1.split(",");
        //遍历分割后的字符串数组。
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("=========================");
        //sample like:
        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("=========================");

        //换成"." 为什么不执行？
        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");//length=0,切割失败。
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
