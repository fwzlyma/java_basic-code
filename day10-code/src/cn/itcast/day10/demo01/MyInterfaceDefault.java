package cn.itcast.day10.demo01;

/*
从Java 8开始，接口里允许定义默认方法。
格式：
public default 返回值类型 方法名称（参数列表）{
    方法体。
}
备注：接口当中的默认方法，可以解决接口升级的问题。
*/
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();
    //新添加了一个抽象方法。
    //如何解决接口投入使用，新添加，会报错，怎样互不干扰？
//    public abstract void methodAbs2();
    public default void methodAbs2(){
        //这是新添加的默认方法
        System.out.println("这是新添加的默认方法");
    }
}
