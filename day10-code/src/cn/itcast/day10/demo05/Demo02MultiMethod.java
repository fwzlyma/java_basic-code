package cn.itcast.day10.demo05;

/*
在多态的代码中，成员方法的访问规则是；
    看new的是谁，就优先用谁，没有则向上找。

【编译看左边，运行看右边！】【成员方法口诀】

对比一下：
成员变量：编译看左边，运行还看左边。
成员方法：编译看左边，运行看右边。
*/
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();//多态
        obj.method();//父子都有，优先用子
        obj.methodFu();//向上找父类

        //编译看左，左边是Fu,Fu当中没有methodZi方法，所以编译报错
//        obj.methodZi();//错误写法！
    }
}
