package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
【题目】
自定义4个学生对象，添加到集合，并遍历。
【思路】
1.自定义Student学生类，四个部分。
2.创建一个集合，用来存储学生对象。泛型：<Student>
3.根据类，创建4个学生对象
4.将4个学生对象添加到集合中：add
5.遍历集合：for、size、get
*/
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> listStu = new ArrayList<>();
        Student stu1 = new Student("迪丽热巴",18);
        Student stu2 = new Student("古力娜扎",18);
        Student stu3 = new Student("玛尔扎哈",38);
        Student stu4 = new Student("福原爱",18);
        listStu.add(stu1);
        listStu.add(stu2);
        listStu.add(stu3);
        listStu.add(stu4);
        //遍历集合。
        for (int i = 0; i < listStu.size(); i++) {
//            Student stu = listStu.get(i);
            System.out.println(listStu.get(i).getName()+"  "+listStu.get(i).getAge());
        }
    }
}
