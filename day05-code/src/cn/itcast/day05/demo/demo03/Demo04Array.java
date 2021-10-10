package cn.itcast.day05.demo.demo03;

/*遍历数组，说的就是
对数组当中的每一个元素挨个处理，默认的处理方式就是打印输出。
* */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = new int[]{10, 25, 25, 40, 50};
        for (int i = 0; i < array.length; i++) {
            System.out.println("第" + (i + 1) + "个值：" + array[i]);
        }
        //array.fori 或者 array.length.fori
    }
}
