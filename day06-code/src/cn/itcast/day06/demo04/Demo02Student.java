package cn.itcast.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();//new对象就是直接调用【构造方法】
        Student stu1 = new Student("马佳佳",22);
        System.out.println("姓名："+stu1.getName());
        System.out.println("年龄："+stu1.getAge());
        //如果需要改变对象当中的成员变量数据内容，仍然需要使用setXxx方法
        stu1.setName("🐎＋＋");
        System.out.println("姓名："+stu1.getName());
        System.out.println("年龄："+stu1.getAge());
    }
}
