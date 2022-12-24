package com.driver;

import java.util.Date;

public class Mail {
    private Date Date;
    private String Sender;
    private String Message;

    public Mail(Date Date, String Sender, String Message) {
        this.Date = Date;
        this.Sender = Sender;
        this.Message = Message;
    }

    public Date getDate(){
        return Date;
    }

    public void setDate(Date Date){
        this.Date = Date;
    }

    public String getSender(){
        return Sender;
    }

    public void setSender(String Sender){
        this.Sender = Sender;
    }

    public String getMessage(){
        return Message;
    }

    public void setMessage(String Message){
        this.Message = Message;
    }
}