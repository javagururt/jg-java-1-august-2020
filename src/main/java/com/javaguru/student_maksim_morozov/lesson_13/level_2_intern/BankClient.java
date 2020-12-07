package com.javaguru.student_maksim_morozov.lesson_13.level_2_intern;

class BankClient {

    private String fullName;
    private String uid;


    public BankClient(String uid, String fullName){
        this.uid = uid;
        this.fullName = fullName;

    }
    public String getUid(){return uid;}
    public String getFullName(){return fullName;}

}
