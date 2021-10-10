package cn.itcast.day06.demo03;

/*
【问题描述】
定义Person年龄时，无法阻止非法数值的设置。
【解决方案】
用private关键字将需要保护的成员变量进行修饰
【注意】
一旦使用private，本类当中仍然可以随意访问。
但是超出了本类范围之外就不能再直接访问。
【如何间接访问？】
定义一对 setAge/getAge
setAge：不能有返回值，参数类型和成员变量对应；
getAge：不能有参数，返回值类型和成员变量对应；
*/
public class Person {
    String name;//姓名
    private int age;//年龄

    public void show(){
        System.out.println("我叫"+name+",今年"+age+"岁");
    }
//    这个成员方法，专门用于向age设置数据。
    public void setAge(int num){//不能有返回值
        if(num < 100 && num > 0){
            age = num;
        }else {
            System.out.println("数据不合理！");
        }
    }
    public int getAge(){//不能有参数。
        return age;
    }
}
