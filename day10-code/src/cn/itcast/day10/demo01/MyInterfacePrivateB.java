package cn.itcast.day10.demo01;

public interface MyInterfacePrivateB {
    public static void methodStatic1(){
        System.out.println("默认方法1");
        methodStaticCommon();
    }
    public static void methodStatic2(){
        System.out.println("默认方法2");
        methodStaticCommon();
    }
    private static void methodStaticCommon(){//解决代码重复问题，而且不会被实现类使用。
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
