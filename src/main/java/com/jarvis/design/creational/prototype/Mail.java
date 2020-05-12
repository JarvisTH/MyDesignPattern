package com.jarvis.design.creational.prototype;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/9 17:01
 */
public class Mail implements Cloneable {

    private String name;

    private String emailAddress;

    private String content;

    public Mail() {
        System.out.println("Mail construct");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    //    v2
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
