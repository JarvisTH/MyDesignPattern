package com.jarvis.design.creational.prototype;

import java.text.MessageFormat;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/9 17:02
 */
public class MailUtil {

    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学，邮件地址：{1}，邮件内容：{2}";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录，original：" + mail.getContent());
    }
}
