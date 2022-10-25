package com.pxk.domain;

/**
 * @author pxk
 * @create 2022-10-24-19:29
 * @describe 台式机类
 */
public class PC implements Equipment{
    private String model;  //机器型号
    private String display;  //显示器名称

    public PC(String model, String display) {
        super();
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model+"\t"+display;
    }

    @Override
    public String toString() {
        return model + "(" + display + ")";
    }
}
