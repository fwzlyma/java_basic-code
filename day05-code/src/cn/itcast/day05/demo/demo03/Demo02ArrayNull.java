package cn.itcast.day05.demo.demo03;

public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
//        System.out.println(array);只是声明，没创建。要初始化。
//        System.out.println(array[0]);//java.lang.NullPointerException
        //必须
        array = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
    }
}
