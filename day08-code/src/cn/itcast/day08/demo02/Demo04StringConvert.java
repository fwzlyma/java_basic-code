package cn.itcast.day08.demo02;

/*
String当中与转换相关的常用方法有：
public char[] toCharArray(): 将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes(): 获得当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString)
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
备注：CharSequence意思是说可以接受字符串类型。
*/
public class Demo04StringConvert {
    public static void main(String[] args) {
        //1.字符串----》字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("==========================");

        //2.转换成为字节数组---->即ASCII码。
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==========================");

        //3.替换字符串。
//        String str = null;
        String str1 = "Hello World!";
        String str2 = str1.replace(" ","@");
        System.out.println(str1);
        System.out.println(str2);

        String lang1 = "会不会玩啊！你大爷的！";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println(lang2);
    }
}
