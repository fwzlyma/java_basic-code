package cn.itcast.day11.demo05;

public class MyInterfaceImpl2 extends MyInterfaceImpl {
    @Override
    public void method2() {
        System.out.println("接口的第一个抽象类实现了第一个方法");
        System.out.println("抽象类的子类继承并重写了接口的第二个方法");
    }
}
