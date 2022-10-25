package com.pxk.domain;

import com.pxk.service.Status;

/**
 * @author pxk
 * @create 2022-10-24-19:19
 * @describe 程序员类
 */
public class Programmer extends Employee{

    private int memberId;   //员工号
    private Status status = Status.FREE;  //状态
    private Equipment equipment;   //设备


    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + getStatus() + "\t\t\t\t\t"
                + getEquipment();
    }

    public String getDetailsForTeam() {
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge()
                + "\t\t" + getSalary() + "\t程序员";
    }
}
