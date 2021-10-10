package cn.itcast.day08.demo04;

import java.util.Arrays;

/*
【题目】
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
*/
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "aslkfdhlsahfdklsfhklsahf";
        //如何排列？必须是一个数组。
        //将字符串转换为字符数组
        char[] charArray = str.toCharArray();
        //使用Arrays对字符数组进行排序
        Arrays.sort(charArray);
//        Arrays.sort
//        System.out.println(Arrays.toString(charArray));
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
