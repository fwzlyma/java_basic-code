package cn.itcast.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();

        //准备一个鼠标
        USB usb = new Mouse();
        Mouse mouse = (Mouse) usb;
        laptop.useDevice(mouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();
        laptop.useDevice(keyboard);//没转型也正确？正确，发生了向上转型。

        laptop.powerOff();
        System.out.println("====================");
        method(10.0);
        method(10);
        int a = 30;
        method(a);
    }
    public static void method(double num){
        System.out.println(num);
    }
}
