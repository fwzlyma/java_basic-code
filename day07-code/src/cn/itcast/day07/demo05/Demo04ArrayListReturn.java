package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
【题目】
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合里。
要求使用自定义的方法来实现筛选。
分析
1.需要创建一个大集合，用来存储int数字：<Integer>
2.随机数字就用Random nextInt()
3.循环20次，把随机数字放入大集合：for循环、add方法
4.定义一个方法，用来进行筛选。
筛选：根据大集合，筛选符合要求的元素，得到小集合。
三要素：
返回值类型：ArrayList小集合（里面元素个数不确定）
方法名称：getSmallList
参数列表：ArrayList 大集合（20个随机数字）
5.判断是否偶数 %2==0
6.如果是偶数，放到小集合，否则不放。
*/
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        int[] array = new int[]{1,2,56,43,25,67,80,32,9,0,55,31};
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;//1-100
            list.add(num);
            System.out.print(num+"  ");
        }
        System.out.println();
        ArrayList<Integer> smallList = getSmallList(list);
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i)+"  ");
        }
        System.out.println();
        System.out.println(smallList.size());
    }
    //筛选方法。
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> listEven = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                listEven.add(list.get(i));
            }
        }
        return listEven;
    }
}
