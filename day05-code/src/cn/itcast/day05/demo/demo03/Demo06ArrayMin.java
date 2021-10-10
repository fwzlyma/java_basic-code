package cn.itcast.day05.demo.demo03;

public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] arrayA = {5, 10, 20, 30, 20, 10000};
        printMin(arrayA);
    }
    public static void printMin(int[] array){
        int[] min = new int[2];
        min[0]=array[0];
        min[1]=1;
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min[0]){
                min[0] = array[i];
                min[1] = i+1;
            }
        }
        System.out.println("最小值是："+min[0]);
        System.out.println("最小值位置在原数组中是："+min[1]);
    }
}
