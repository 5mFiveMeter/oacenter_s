package com.baomidou.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wm
 * @since 2020-03-12
 */
public class User_info implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer id;

    private Integer age;

    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User_info{" +
        "id=" + id +
        ", age=" + age +
        ", name=" + name +
        "}";
    }
}
