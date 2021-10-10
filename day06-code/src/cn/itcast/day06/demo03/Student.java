package cn.itcast.day06.demo03;

public class Student {
    private String name;//姓名
    private int age;
    private boolean male;//是不是男的

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {//【特别 isMale】
        return male;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
}
