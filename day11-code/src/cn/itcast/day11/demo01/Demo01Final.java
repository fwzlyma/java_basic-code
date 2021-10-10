package cn.itcast.day11.demo01;

/*
final 关键字代表最终、不可改变的。

常见四种用法：
1.可以修饰一个类
2.可以用来修饰一个方法
3.还可以用来修饰一个局部变量
4.还可以用来修饰一个成员变量
*/
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        //一次赋值，终生不变。
        final int num2 = 200;
        System.out.println(num2);
//        num2 = 250;//错误写法！
//        num2 = 200;//错误写法！
        final int num3;
        num3 = 66;

        //对于基本类型来说，不可变说的是变量当作的数据不可改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可改变.
        Student stu = new Student("赵丽颖");
        System.out.println(stu);
        System.out.println(stu.getName());
        stu = new Student("霍建华");
        System.out.println(stu);
        System.out.println(stu.getName());
        System.out.println("=============================");
        //
        final Student stu2 = new Student("高圆圆");
//        stu2 = new Student("赵丽颖");//错误写法，final修饰的引用对象地址值不可改变。
        System.out.println(stu2.getName());
        stu2.setName("高圆圆圆圆圆圆");
        System.out.println(stu2.getName());
    }
}
