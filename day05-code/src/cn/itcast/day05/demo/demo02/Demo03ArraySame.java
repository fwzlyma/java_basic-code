package cn.itcast.day05.demo.demo02;

public class Demo03ArraySame {
    public static void main(String[] args) {
        int[] arrayA = new int[3];//动态初始化
        System.out.println(arrayA);
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayA[i]);//0
        }
        System.out.println("========================");
        arrayA[1] = 10;
        arrayA[2] = 20;
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayA[i]);
        }

        System.out.println("******************************");
        //将arrayA数组的地址值赋给arrayB
        int[] arrayB = arrayA;//动态初始化
        System.out.println(arrayB);
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayB[i]);//
        }
        System.out.println("========================");
        arrayB[1] = 100;
        arrayB[2] = 200;
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayB[i]);
        }
    }

}
