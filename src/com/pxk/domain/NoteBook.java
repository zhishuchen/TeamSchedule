package com.pxk.domain;

/**
 * @author pxk
 * @create 2022-10-24-19:24
 * @describe 笔记本类
 */
public class NoteBook implements Equipment {

    private String model; //机器型号
    private double price;  //价格

    public NoteBook(String model, double price) {
        super();
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model+"\t"+price;
    }

    @Override
    public String toString() {
        return model + "(" + price + ")";
    }
}
