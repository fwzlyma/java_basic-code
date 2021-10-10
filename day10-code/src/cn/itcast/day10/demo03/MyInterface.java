package cn.itcast.day10.demo03;

/*
这个子接口当中有几个方法？答：四个
methodA
methodB
methodCommon 同时来源于接口AB
method自己的
*/
public interface MyInterface extends MyInterfaceA,MyInterfaceB {

    public abstract void method();

    @Override
    public default void methodDefault() {
        System.out.println("AAA");
    }
}
