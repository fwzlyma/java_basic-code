package cn.itcast.day09.demo10;

public class Zi extends Fu {
    int num = 20;

    @Override//能写就写。
    public void method() {
//        super.method();//成员方法【不会默认给】，如果没这句super那么不会执行父类的成员方法的。
        System.out.println("子类方法");
    }
    public void show(){
        int num =30;
        System.out.println(num);//30
        System.out.println(this.num);//20
        System.out.println(super.num);//10
    }
}
