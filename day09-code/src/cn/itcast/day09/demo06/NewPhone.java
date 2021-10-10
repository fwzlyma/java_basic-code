package cn.itcast.day09.demo06;

//定义一个新手机，使用老手机作为父类
public class NewPhone extends Phone{

    @Override
    public void show() {
        super.show();//万一父类有一万行，咋办，直接调方法。
        //子类再来添加更多内容。
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
