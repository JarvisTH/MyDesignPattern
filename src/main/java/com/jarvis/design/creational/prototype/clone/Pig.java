package com.jarvis.design.creational.prototype.clone;

import java.util.Date;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/9 17:19
 */
public class Pig implements Cloneable{
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

//    v1——克隆的对象所引用的对象是同一个引用对象，解决方法v2
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

//    v2
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig=(Pig)super.clone();

        //深克隆
        pig.birthday=(Date)pig.birthday.clone();
        return pig;
    }
}
