package cn.itcast.day10.demo01;

/*
接口当中也可以定义成员变量，但是必须使用public static final 三个关键字进行修饰。
从效果上看，这其实就是接口的【常量】。
格式：
public static final 数据类型  常量名称  =  数据值；

【注意事项】
1.接口当中的常量，可以省略public static final,注意，不写也照样是这样。
2.接口当中的常量，必须进行赋值；不能不赋值。
3.接口中常量的名称，使用完全大写的字母，用下划线进行分隔。
*/
public interface MyInterfaceConst {
    //这其实就是一个常量，一旦赋值，不可以修改。
    //public公共、static接口使用、final不可变
    public static final int NUM_OF_MY_CLASS = 10;
}
