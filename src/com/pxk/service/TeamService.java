package com.pxk.service;

import com.pxk.domain.Architect;
import com.pxk.domain.Designer;
import com.pxk.domain.Employee;
import com.pxk.domain.Programmer;

/**
 * @author pxk
 * @create 2022-10-25-14:10
 * @describe 开发团队管理
 */
public class TeamService {
    private static int counter = 1; //用于生成成员id
    private final int MAX_MEMBER = 5;   //最大人数
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;  //开发团队人数

    //返回开发团队
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        Programmer p = (Programmer) e;

        switch (p.getStatus()) {
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VACATION:
                throw new TeamException("该员工正在休假，无法添加");
        }
        if (isExist(p)) {
            throw new TeamException("该员工已在本团队中");
        }

        //计算团队中各岗位人数，从小到大判断
        int numOfPro = 0, numOfDes = 0, numOfArch = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }

        //团队各岗位人数是否满足要求
        if (p instanceof Architect && numOfArch >= 1) {
            throw new TeamException("团队中至多只能有一名架构师");
        } else if (p instanceof Designer && numOfDes >= 2) {
            throw new TeamException("团队中至多只能有两名设计师");
        } else if (p instanceof Programmer && numOfPro >= 3) {
            throw new TeamException("团队中至多只能有三名程序员");
        }

        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
        team[total++] = p;
    }

    public void removeMember(int memberId) throws TeamException{
        int i;
        for (i = 0;  i<total ; i++) {
            if (team[i].getMemberId()==memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i==total){
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }
        //后面的成员前移
        for (int j = i; j < total-1; j++) {
            team[j]=team[j+1];
        }
        //将最后一个赋值为null
        team[--total]=null;
    }

    //判断p是否已在开发团队中
    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }
}
