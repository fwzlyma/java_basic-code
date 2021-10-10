package cn.itcast.day05.demo.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] arrayA = {5, 10, 20, 30, 20, 10000};
        int[] max1 = max(arrayA);
        System.out.println("最大值：" + max1[0]);
        System.out.println("它在原数组中位置：" + max1[1]);
    }

    public static int[] max(int[] array) {
        int[] max = new int[2];
        max[0] = array[0];
        max[1] = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max[0]) {
                max[0] = array[i];
                max[1] = i + 1;
            }
        }
        return max;
    }
}
