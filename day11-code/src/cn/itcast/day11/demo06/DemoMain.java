package cn.itcast.day11.demo06;

public class DemoMain {
    public static void main(String[] args) {

        //创建一个武器对象
        Weapon w1 = new Weapon("斯塔缇克电刃");
        //创建一个英雄对象
        Hero hero = new Hero("无极剑圣",30,w1);
//        hero.getWeapon().getCode();
        System.out.println(hero.getWeapon().getCode());
        //年龄为30的无极剑圣用斯塔缇克电刃正在攻击别人
        hero.attack();
    }
}
