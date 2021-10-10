package cn.itcast.day09.demo10;

public class Demo {
    public static void main(String[] args) {
        //父类构造方法！父类构造方法会最优先执行。
        Zi zi = new Zi();
        zi.show();
        zi.method();
    }
}
