package cn.itcast.day06.demo01;

/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。
【步骤】
1.导包：也就是指出需要使用的类在什么位置
import 包名称.类名称
import cn.itcast.day06.demo01.Student;
对于和当前类属于同一个包的情况，可以省略导包语句不写。

2.创建：格式：
类名称 对象名 = new 类名称();
Student stu1 = new Student();

3.使用：分为两个情况。
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名（参数）
（也就是，想用谁，就用对象名点儿谁。）
【注意事项】
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
*/
public class Demo02Student {
    public static void main(String[] args) {
        //【1.导包】--同一个包下，省略不写。
        //【2.创建】
        Student stu = new Student();
        //【3.使用成员变量】
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        //【4.使用对象的成员方法】
        //对象名.成员方法名()
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
