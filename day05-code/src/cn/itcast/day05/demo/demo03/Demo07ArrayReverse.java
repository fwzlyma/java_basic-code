package cn.itcast.day05.demo.demo03;

/*
数组元素反转：
本来的样子：{1，2，3，4}
之后的样子：{4，3，2，1}
【要求】
不能使用新数组。
*/
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(arrayA);
        reverse(arrayA);
        printArray(arrayA);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static void reverse(int[] array) {
        int traverseLen = array.length / 2;
        int len = array.length;
        int temp;
        for (int i = 0; i < traverseLen; i++) {
            temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }
    }
}
