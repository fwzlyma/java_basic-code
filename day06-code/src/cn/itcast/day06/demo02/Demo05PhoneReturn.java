package cn.itcast.day06.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    /*
    当使用一个对象类型作为方法的返回值时：返回值其实就是对象的【地址值】。
    */
    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "土豪金";
        return one;
    }
}
