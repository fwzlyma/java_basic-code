package cn.itcast.day10.demo01;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    public void methodAnother(){
        //直接访问到了接口中的默认方法。这样是错误的。
        //这个方法是专门安排给另外两个的。
//        methodCommon();
    }
}
