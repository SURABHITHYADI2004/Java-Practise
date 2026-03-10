package com.demo.bean;

public class TableBean {

    private int num;

    public TableBean() {}

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    public int getResult(int i){
        return num * i;
    }
}