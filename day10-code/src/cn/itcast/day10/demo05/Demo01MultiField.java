package cn.itcast.day10.demo05;

/*
访问成员变量的两种方式：
1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
2.直接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。
*/
public class Demo01MultiField {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);//父类的num 因为obj左边是Fu
//        System.out.println(obj.age);//找不到子类的age
        System.out.println("========================");
        obj.show();
    }
}
