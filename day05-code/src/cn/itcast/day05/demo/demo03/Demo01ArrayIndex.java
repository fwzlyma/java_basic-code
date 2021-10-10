package cn.itcast.day05.demo.demo03;

/*
数组的索引编号从0开始，一直到数组长度-1为止。
索引编号不能写错！！！
*/
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] arrayA = new int[]{10,20,30};
        for (int i = 0; i < 3; i++) {
            System.out.print(arrayA[i]+"  ");
        }
        //错误写法，索引越界异常。
//        System.out.println(arrayA[3]);
    }
}
