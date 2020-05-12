package com.jarvis.design.creational.singleton;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 10:59
 */
public class Test {

    //    多线程
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadTest());
        Thread t2 = new Thread(new ThreadTest());
        t1.start();
        t2.start();
        System.out.println("end");
    }

//    序列化
//    public static void main(String[] args) throws Exception{

//        HungrySingleton instance=HungrySingleton.getInstance();

//        EnumInstance instance=EnumInstance.getInstance();
//        instance.setData(new Object());
//
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("singleton"));
//        oos.writeObject(instance);
//
//        File file=new File("singleton");
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newInstance=(HungrySingleton)ois.readObject();
//
//        EnumInstance newInstance=(EnumInstance)ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData()==newInstance.getData());
//    }

    // 反射攻击
//    public static void main(String[] args) throws Exception{
//        Class objectClass=HungrySingleton.class;
//        Class objectClass=StaticInnerClassSingleton.class;

//        Class objectClass=LazySingleton.class;
//        Class objectClass=EnumInstance.class;
//
//        Constructor constructor=objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//        EnumInstance instance=(EnumInstance)constructor.newInstance("test",666);

//        HungrySingleton instance=HungrySingleton.getInstance();
//        HungrySingleton newInstance=(HungrySingleton)constructor.newInstance();
//        StaticInnerClassSingleton instance=StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance=(StaticInnerClassSingleton)constructor.newInstance();

//        LazySingleton instance=LazySingleton.getInstance();
//        LazySingleton newInstance=(LazySingleton)constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(newInstance==instance);

//        EnumInstance instance=EnumInstance.getInstance();
//        instance.printTest();

//    }
}
