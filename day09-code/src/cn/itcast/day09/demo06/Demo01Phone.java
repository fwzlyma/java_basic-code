package cn.itcast.day09.demo06;

/*
设计原则：
对于已经投入使用的类，尽量不要进行修改。
推荐自定义一个新的类，来重复利用其中共性内容，并且添加改动新内容。
*/
public class Demo01Phone {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.call();
        one.send();
        one.show();
        System.out.println("====================");
        NewPhone two = new NewPhone();
        two.call();
        two.send();
        two.show();
    }
}
