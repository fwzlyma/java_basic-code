package cn.itcast.day08.demo02;

/*
【地址值比较】
==是进行对象的地址值的比较，如果确实需要字符串的内容比较，可以使用两个方法；

public boolean equals(Object obj):参数可以是任何对象。只有参数是一个字符串并且内容相同的才会给true，否则返回false；
备注：任何对象都能用Object进行接受。
【注意事项】
1.任何对象都能用Object接收
2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
推荐："abc".equals(str1);
不推荐：str1.equals("abc"); X

public boolean equalsIgnoreCase(String str);忽略大小写，进行内容比较。
*/
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str2.equals(str3));//true
        System.out.println("Hello".equals(str3));//true

        //推荐“abc”.equals()原因
        String str5 = null;
//        System.out.println(str5.equals("abc"));//空指针异常。
        System.out.println("abc".equals(str5));
        System.out.println("=======================================");
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));//false
        System.out.println(strA.equalsIgnoreCase(strB));//true

        //注意：只有英文字母区分大小写，其他都不区分。
        System.out.println("abc一123".equalsIgnoreCase("abc壹123"));//false
    }
}
