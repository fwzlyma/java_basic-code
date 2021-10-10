package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        //首先需要一个集合，用来存储若干个红包的金额。
        ArrayList<Integer> redList = new ArrayList<>();
        //首先看一下群众自己有多少钱。
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足！");
            return redList;
        }

        //扣钱，其实就是重新设置余额。
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分成为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//余数，甩下的零头。
        for (int i = 0; i < count; i++) {
            redList.add(avg);
            if (i == count - 1) {
                redList.add(avg + mod);
            }
        }
        return redList;
    }
}
