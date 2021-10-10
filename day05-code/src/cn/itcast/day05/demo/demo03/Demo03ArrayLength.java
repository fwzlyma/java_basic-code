package cn.itcast.day05.demo.demo03;

/*如何获取数组的长度：
* 数组名称.length
* 这将会得到一个int数组，代表数组长度。
* 【注意事项】
* 数组一旦创建，程序运行期间，长度不可改变。
* */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = new int[]{10,20,30,5,6,7,8,9,8,89,32,45};
        int len = arrayB.length;
        System.out.println("数组A的长度是："+arrayA.length);
        System.out.println("数组B的长度是："+len);
        System.out.println("=================================");
        int[] arrayC = new int[3];
        System.out.println("前地址："+arrayC);
        System.out.println(arrayC.length);//3
        arrayC = new int[5];
        System.out.println("后地址："+arrayC);
        System.out.println(arrayC.length);//5
        System.out.println("这是两个完全不同的创建出来的数组，所以显示出来是长度不同");
    }
}
