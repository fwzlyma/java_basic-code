package cn.itcast.day08.demo02;

/*
String 当中与获取相关的常用方法有：

public int length():获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index): 获取指定索引位置的单个字符。索引0开始
public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1；
*/
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串的长度。
        int length = "sladfhasfhasdlhfa".length();
        System.out.println("字符串的长度："+length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);//新字符串
        String str4 = str1+str2;//新字符串。
        System.out.println("原字符串："+str1);//Hello原封不动
        System.out.println("原字符串："+str2);//World原封不动
        System.out.println("concat字符串："+str3);//HelloWorld新的字符串。
        System.out.println("字符串直接相加："+str4);

        //获取指定索引位置的单个字符
        char ch = str1.charAt(1);
        System.out.println(ch);

        //查找参数字符串在本来字符串当中出现的第一次索引位置。
        //如果根本没有，返回-1；
        String original = "HelloWorld";
        int index = original.indexOf("rl");
        System.out.println("第一次索引值是："+index);

        System.out.println("HelloWorld".indexOf("abc"));//-1
    }
}
