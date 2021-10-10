package cn.itcast.day07.demo04;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
ArrayList 当中的【常用方法】有：
public boolean add(E,e):向集合当中添加元素，参数的类型和泛型一致。
    有【返回值】true/false代表添加是否成功
public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。
public int size():获取集合的尺寸长度，返回值是集合当中包含的元素个数。
*/
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合添加元素：add
        boolean success = list.add("柳岩");
        System.out.println(list);
        System.out.println("添加的动作是否成功："+success);

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        System.out.println(list);

        String name = list.get(2);
        System.out.println("第二号索引的位置："+name);

        String whoWasRemoved = list.remove(3);
        System.out.println(list);
        System.out.println("被删掉的人是："+whoWasRemoved);

        int size = list.size();
        System.out.println("集合的长度是："+size);

        /*ArrayList<Person> list = new ArrayList<>();
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",18);
        Person three = new Person("玛尔扎哈",38);
        list.add(one);
        list.add(two);
        list.add(three);【这里没有错】--但是‘人’是一个整体，所以只打印地址值，具体还得调用方法才能看到里面的具体成员变量啊！！！
        System.out.println(list);*/
    }
}
