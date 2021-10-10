package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
【题目】
定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}括起来集合，使用@分隔每个元素。
格式参照： {元素@元素@元素}。

System.out.println(list);  [10,20,30]
printArrayList(list);      {10@20@30}
*/
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        list.add("福原爱");
        printMyList(list);
    }
    /*
    定义方法的三要素：
    返回值类型：只是进行打印而已，没有运算，没有结果，用void
    方法名称：printMyList
    参数列表：ArrayList
    */
    public static void printMyList(ArrayList<String> list){
        System.out.println("开始打印...");
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i!=list.size()-1){
                System.out.print(list.get(i)+"@");
            }else{
                System.out.print(list.get(i));
            }
        }
        System.out.println("}");
    }
}
