package cn.itcast.day07.demo04;

/*
【题目】
定义一个数组，用来存储3个Person对象.

【缺点】
数组 有一个缺点：一旦创建，程序运行期间长度不可以发生改变；
*/
public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，用来存放Person类型的对象。
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",18);
        Person three = new Person("玛尔扎哈",38);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);//地址值；
        }
        System.out.println(array[1].getName());
    }
}
