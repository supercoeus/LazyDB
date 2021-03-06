package org.kesar.lazy.lazydb;


import org.kesar.lazy.lazydb.annotate.ID;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kesar on 2016/6/21 0021.
 */
public class Entity implements Serializable
{
    @ID
    private String id;
    private String name;
    private boolean sex;
    private int age;
    private double money;
    private Date birthday;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public boolean isSex()
    {
        return sex;
    }

    public void setSex(boolean sex)
    {
        this.sex = sex;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public double getMoney()
    {
        return money;
    }

    public void setMoney(double money)
    {
        this.money = money;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", birthday=" + birthday +
                '}';
    }
}
