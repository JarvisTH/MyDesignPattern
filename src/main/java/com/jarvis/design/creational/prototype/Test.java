package com.jarvis.design.creational.prototype;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/9 17:05
 */
public class Test {
    public static void main(String[] args) throws Exception{

//        v1
//        Mail mail=new Mail();
//        mail.setContent("初始化模板");
//        for(int i=0;i<10;i++){
//            mail.setName("姓名"+i);
//            mail.setEmailAddress("地址"+i+".com");
//            mail.setContent("immoc活动通知");
//            MailUtil.sendMail(mail);
//        }
//        MailUtil.saveOriginMailRecord(mail);

//         v2
        Mail mail=new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail："+mail);
        for(int i=0;i<10;i++){
            Mail temp=(Mail)mail.clone();
            temp.setName("姓名"+i);
            temp.setEmailAddress("地址"+i+".com");
            temp.setContent("immoc活动通知");
            System.out.println("克隆的mail："+temp);
            MailUtil.sendMail(temp);
        }
        MailUtil.saveOriginMailRecord(mail);

    }
}
