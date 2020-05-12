package com.jarvis.design.creational.singleton;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 15:33
 */
public enum EnumInstance {
    INSTANCE {
        protected void printTest() {
            System.out.println("test");
        }
    };

    private Object data;

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

    protected abstract void printTest();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
