package com.pxk.domain;

/**
 * @author pxk
 * @create 2022-10-24-19:26
 * @describe 打印机类
 */
public class Printer implements Equipment{
    private String name;
    private String type;  //机器类型

    public Printer(String name, String type) {
        super();
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name+"\t"+type;
    }

    @Override
    public String toString() {
        return name + "(" + type + ")";
    }
}
