package cn.itcast.day10.demo06;

/*
如何知道一个父类引用的对象，本来是什么子类？
格式：
对象 instanceof 类型
这将会得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例。
*/
public class Demo02Instaceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

        //如果希望调用子类特有方法
        //向下转型还原
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        giveMeAPet(new Dog());
    }
    public static void giveMeAPet(Animal animal){
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
    }
}
