package cn.itcast.day05.demo.demo01;

/*
* 直接打印数组名称，得到的是数组对应的；内存地址哈希值。
* 二进制：0 1
* 十进制：0123456789
* 16进制：0123456789abcdef
* 访问数组元素的格式：数组名称[索引值]
* 索引值：就是一个int数组，代表数组的元素的编号。
* 【注意事项】索引从0开始，知道数组长度-1为止。
* */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        //静态初始化的省略格式：
        int[] array = {10, 20, 30};
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
//        System.out.println(array);//[I@50cbc42f
        int num = array[1];
        System.out.println(num);
    }
}
