package cn.itcast.day05.demo.demo02;

public class Demo01ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3];//动态初始化
        System.out.println(array);
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);//0
        }
        System.out.println("========================");
        array[1] = 10;
        array[2] = 20;
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
    }
}
