package cn.itcast.day05.demo.demo01;

/*
使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下：
如果是整数类型，那么默认是0；
如果是浮点类型，那么默认是0.0；
如果是字符类型，那么默认是‘\u0000’;
如果是布尔类型，那么默认是false；
如果是引用类型，那么默认是null;
【注意事项】
静态初始化其实也有默认值的过程，只不过系统马上自动将默认值替换成为大括号当中的具体数值。
*/
public class Demo05ArrayUse {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array = new int[3];
        System.out.println(array);//[I@50cbc42f
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < 3; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
    }
}
