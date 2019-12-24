package com.hundsun.rd.zhuyf.practice.prototype;

import java.io.*;
import java.text.*;
import java.util.Date;

/**
 * @author zhuyf
 */
public class Mail implements Cloneable, Serializable {

    private String userName;
    private String emailAddress;
    private String mailContent;
    private Date sendDate;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mail copy = null;
        try {
            FileOutputStream fos = new FileOutputStream("mail.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);

            FileInputStream fis = new FileInputStream("mail.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            copy = (Mail)ois.readObject();
            copy.sendDate = new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return copy;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public void save(){
        String mailContent = "System send a email to {0},the emailAddress is {1},the content is {2},the send date is {3}";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String sendDate = dateFormat.format(this.sendDate);
        System.out.println(MessageFormat.format(mailContent,this.userName,this.emailAddress,this.mailContent,sendDate));
    }
}
