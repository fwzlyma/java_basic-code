package cn.itcast.day08.demo03;

/*
如果一个成员变量使用了static关键字，那么
这个变量不再属于对象自己，而是属于所在的类。
多个对象共享同一份数据。
*/
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("迪丽热巴",18);
        one.room = "101";
        System.out.println("学号："+one.getId()+" 姓名："+one.getName()+" 年龄："+one.getAge()+" 教室："+one.room);
        Student two = new Student("古力娜扎",18);
        System.out.println("学号："+two.getId()+" 姓名："+two.getName()+" 年龄："+two.getAge()+" 教室："+two.room);
    }
}
