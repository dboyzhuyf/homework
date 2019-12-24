package com.hundsun.rd.zhuyf.practice.prototype;

import java.util.Date;

public class MailTest {

    public static void main(String[] args) {

        System.out.println("Initializing...");
        Mail mail = new Mail();
        mail.setUserName("templateUserName");
        mail.setEmailAddress("template@hundsun.com");
        mail.setMailContent("This is a email template.");
        mail.setSendDate(new Date());
        mail.save();
        System.out.println(mail);
        System.out.println("Coping...");
        for (int i = 0;i < 10;i++){
            try {
                Mail copy = (Mail)mail.clone();
                System.out.println(copy);
                copy.setUserName("guest" + i);
                copy.setEmailAddress("guest" + i + "@hundsun.com");
                copy.save();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Find the origin mail content.");
        System.out.println(mail);
        mail.save();
    }
}
