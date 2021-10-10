package cn.itcast.day09.demo07;

public class Zi extends Fu {

    public Zi(){
//        super();//什么都不写，默认赠送一个。
        super(10);//调用父类重载的构造方法
        //重载--方法重名但是参数列表不一样。
        System.out.println("子类构造方法！");
    }
    public void method(){
//        super();//错误写法！只有子类构造方法，才能调用父类构造方法。
    }
}
