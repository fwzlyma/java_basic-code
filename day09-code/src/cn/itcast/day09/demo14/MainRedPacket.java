package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager ma = new Manager("群主",100);
        Member m1 = new Member("A",0);
        Member m2 = new Member("B",0);
        Member m3 = new Member("C",0);
        //信息
        ma.showMessage();
        m1.showMessage();
        m2.showMessage();
        m3.showMessage();
        System.out.println("***********************");
        //发红包
        ArrayList<Integer> redList = ma.send(40,3);
        m1.receive(redList);
        m2.receive(redList);
        m3.receive(redList);
        //余额查询：
        ma.showMessage();
        m1.showMessage();
        m2.showMessage();
        m3.showMessage();
    }
}
