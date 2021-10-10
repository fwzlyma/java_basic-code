package cn.itcast.day09.demo04;

/*
在父子类继承关系中，创建子类对象，访问成员方法的 规则：
    创建的对象是谁，就优先找谁，如果没有则向上找。
【注意事项】
无论是成员方法还是成员变量，如果没有都是向上找父类，绝不会向下找子类的。

【重写】
override 概念：在继承关系中，方法的名称一样，参数列表也一样。
重写override:方法的名称一样，参数列表也一样。重写叫做方法的覆盖、覆写。
重载overload:方法的名称一样，但是参数列表不一样。

方法的覆盖重写特点：创建的是子类对象，则优先使用子类方法。
*/
public class Demo01ExtendMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();

        //创建的是zi对象，所以优先使用zi的重名方法不会向上找父类的方法。
        zi.method();
    }
}
