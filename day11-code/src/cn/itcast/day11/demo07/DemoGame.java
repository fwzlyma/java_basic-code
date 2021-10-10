package cn.itcast.day11.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero obj = new Hero();
        obj.setName("无极剑圣");//设置英雄名称

//        Skill skill = new SkillImpl();
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("AAEAWAQAA~");
            }
        };
        obj.setSkill(skill);
        obj.attack();
    }
}
