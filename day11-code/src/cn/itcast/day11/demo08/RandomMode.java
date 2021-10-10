package cn.itcast.day11.demo08;

import cn.itcast.day11.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> redList = new ArrayList<>();
        //随机分配
        //最多一分钱，最多不超过剩余金额平均数的2倍。
        //第一次发红包,随机范围0.01~6.66
        Random r = new Random();
        int avg2;
        int moneyRandom;
        int leftMoney = totalMoney, leftCount = totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            avg2 = (leftMoney / leftCount) * 2;
            moneyRandom = r.nextInt(avg2) + 1;
            leftMoney -= moneyRandom;
            leftCount--;
            redList.add(moneyRandom);
        }
        redList.add(leftMoney);

        return redList;
    }
}
