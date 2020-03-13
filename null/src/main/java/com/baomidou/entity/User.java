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
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * ä¸»é”®ID
     */
      private Long id;

    /**
     * å§“å
     */
    private String name;

    /**
     * å¹´é¾„
     */
    private Integer age;

    /**
     * é‚®ç®±
     */
    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", email=" + email +
        "}";
    }
}
