package cn.itcast.day10.demo06;

/*
向上转型一定是安全的，没有问题的正确的。但是也有一个弊端：
对象一旦向上转型为父类，那么就无法调用子类原本特有的内容。

【向下转型】【还原】成为本来的子类对象。
类似于强制类型转换。
一定要对应类型还原，否则会出现转型错误！
*/
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是：父类引用指向子类对象。
        Animal animal = new Cat();//本来是猫，向上转型为动物
        animal.eat();

        //【还原】
        Cat cat = (Cat)animal;
        cat.catchMouse();

//        animal.catchMouse();//错误写法！

        //下面是错误的向下转型
        //本来new的时候是一只猫,非要当作够
        //java.lang.ClassCastException
//        Dog dog = (Dog)animal;//错误写法！编译不会报错，但是运行会出现异常。

    }
}
