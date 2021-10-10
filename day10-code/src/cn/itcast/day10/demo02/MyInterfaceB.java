package cn.itcast.day10.demo02;

public interface MyInterfaceB {
    //错误写法！接口不能有静态代码块
    /*static {

    }*/
    //错误写法！接口不能有构造方法
    /*public MyInterfaceA(){

    }*/
    public abstract void methodB();//接口B的静态方法。
    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("AAA");
    }
}
