package com.pxk.domain;

import com.pxk.service.Status;

/**
 * @author pxk
 * @create 2022-10-24-19:20
 * @describe 架构师
 */
public class Architect extends Designer{
    private int stock;  //股票数量

    public Architect(int id, String name, int age, double salary, Equipment equipment,double bonus, int stock) {
        super(id, name, age, salary,equipment,bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus()
                + "\t" + getStock() + "\t" + getEquipment();
    }

    public String getDetailsForTeam() {
        return getMemberId() + "/" + getId() + "\t\t" + getName() + "\t" + getAge()
                + "\t\t" + getSalary() + "\t架构师\t" + getBonus() + "\t" + getStock();
    }
}
