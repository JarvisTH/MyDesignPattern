package com.jarvis.design.creational.singleton;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 11:26
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton=null;

    private LazyDoubleCheckSingleton(){

    }

//    v2
    // 存在指令重排序问题,发生指令重排序,多线程会导致多个实例产生
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton==null){
                    lazyDoubleCheckSingleton=new LazyDoubleCheckSingleton();
                    // 1.分配内存给对象
                    // 2.初始化对象
                    // 3.设置lazyDoubleCheckSingleton 指向刚分配的内存
                    // 1->2->3   ==>  1->3->2
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
