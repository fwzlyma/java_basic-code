package cn.itcast.day10.demo07;

public class Laptop {

    public void powerOn(){
        System.out.println("笔记本开机");
    }
    public void powerOff(){
        System.out.println("笔记本关机");
    }
    public void useDevice(USB usb){
        usb.openDevice();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;//向下转型
            mouse.click();//使用方法
//            ((Mouse) usb).click();
        }
        if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;//向下转型
            keyboard.type();//使用方法
//            ((Keyboard) usb).type();
        }
        usb.closeDevice();
    }
}
