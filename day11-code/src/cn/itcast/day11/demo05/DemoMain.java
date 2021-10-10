package cn.itcast.day11.demo05;

/*
如果接口的实现类，或者是父类的子类，只需要使用唯一的一次，
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

匿名内部类的定义格式：
接口名称  对象名  =  new  接口名称();
MyInterface impl = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法！");
            }
        };
对格式进行解析：
1.new代表创建对象的动作
2.接口名称就是匿名内部类需要实现哪个接口
3.{...}这才是匿名内部类的内容

另外还要注意几点问题：
1.匿名内部类，在创建对象的时候，只能使用唯一一次。
如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了。
2.匿名对象，在调用方法的时候，只能使用唯一一次。
如果希望多次使用对象，创建对象名称。
3.匿名内部类是省略了实现类/子类名称，但是匿名对象省略了实现对象名称。
强调：匿名内部类和匿名对象不是一回事！
*/
public class DemoMain {
    public static void main(String[] args) {

        //1.
        MyInterfaceImpl obj = new MyInterfaceImpl2();
        obj.method();
        obj.method2();

        //【2.匿名内部类】--直接用接口。
        /*MyInterface impl = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法！");
            }
        };
        impl.method();*/
    }
}
