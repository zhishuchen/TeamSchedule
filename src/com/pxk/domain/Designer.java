package com.pxk.domain;

/**
 * @author pxk
 * @create 2022-10-24-19:19
 * @describe 设计师类
 */
public class Designer extends Programmer{
    private double bonus;   //奖金

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + getBonus() + "\t\t\t" + getEquipment();
    }
    public String getDetailsForTeam() {
        return getMemberId() + "/" + getId() + "\t\t" + getName() + "\t" + getAge()
                + "\t\t" + getSalary() + "\t设计师\t" + getBonus();
    }
}
