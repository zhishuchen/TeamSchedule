package com.pxk.service;

/**
 * @author pxk
 * @create 2022-10-25-13:48
 * @describe 自定义异常类
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -33875229948L;
    public TeamException(){

    }

    public TeamException(String message){
        super(message);
    }
}
