package cn.itcast.day04.demo04;

/*对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦。
方法的重载：overload--名字一样，参数不一样。
多个方法的名称一样，但是参数列表不一样。
好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能。

方法重载与下列因素相关：
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同

方法重载与下列因素无关：
1.与参数名称无关--即不能将一个函数改参数a->x来构造新函数
2.与方法的返回值类型无关。
*/
public class Demo01MethodOverload {
    public static void main(String[] args) {
        /*System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));*/
        System.out.println(sum(10, sum(20, 30, 40)));
//        System.out.println(sum(10,20,30,40,50));//错误！
    }

    public static int sum(int a, int b) {
        System.out.println("------------------------");
        return a + b;
    }

    /*public static double sum(int a,int b){
        return a+b;
    }*///错误！

    public static int sum(int a, int b, int c) {
        System.out.println("========================");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("************************");
        return a + b + c + d;
    }
}
