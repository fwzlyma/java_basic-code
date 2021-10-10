package cn.itcast.day10.demo02;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("这是接口A的抽象类的实现！");
    }

    @Override
    public void methodAbs() {
        System.out.println("这是接口A B都有的抽象方法。");
    }

    @Override
    public void methodDefault() {
        System.out.println("AAA");
    }

    @Override
    public void methodB() {
        System.out.println("这是接口B的抽象类的实现！");
    }
}
