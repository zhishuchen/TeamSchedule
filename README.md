# TeamSchedule
【Java基础】开发团队调度软件
### 1.主界面
从公司员工中选择，添加到开发团队中。
![image](https://img2022.cnblogs.com/blog/1986560/202210/1986560-20221026083654866-1401979106.png)

### 2.软件组成
view：菜单显示和处理用户操作。
service：提供员工数据的数组和对员工的管理，被view调用。
domain：实体类。
![image](https://img2022.cnblogs.com/blog/1986560/202210/1986560-20221026084101099-1824571184.png)

### 3.实现过程
##### （1）第一步：实体类、键盘输入和员工状态枚举类
![image](https://img2022.cnblogs.com/blog/1986560/202210/1986560-20221026084958321-309321166.png)

实体类之间的继承关系

![image](https://img2022.cnblogs.com/blog/1986560/202210/1986560-20221026084801386-1828444633.png)

##### （2）第二步：
NameListService：公司员工数据，把Data中的员工和设备数据，变成对象的属性值，将对象存放在数组employees中。

TeamService：提供将公司员工数据添加到开发团队，删除团队成员，岗位人数判断，成员状态判断，是否已存在团队中。

TeamException：自定义异常类。

![image](https://img2022.cnblogs.com/blog/1986560/202210/1986560-20221026094514377-685227303.png)

##### （3）第三步：TeamView主页面菜单显示
调用TeamService和NameListService中的方法。
![image](https://img2022.cnblogs.com/blog/1986560/202210/1986560-20221026095149215-1452522873.png)

