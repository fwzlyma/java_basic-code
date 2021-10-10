package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(){
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包当中随便抽取一个，给我自己
//        int len = list.size();//不好，不能实时变化
        Random r = new Random();
        int delta = list.remove(r.nextInt(list.size()));
        super.setMoney(super.getMoney()+delta);
    }
}
