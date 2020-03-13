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
public class Hibernate_sequence implements Serializable {

    private static final long serialVersionUID=1L;

    private Long next_val;


    public Long getNext_val() {
        return next_val;
    }

    public void setNext_val(Long next_val) {
        this.next_val = next_val;
    }

    @Override
    public String toString() {
        return "Hibernate_sequence{" +
        "next_val=" + next_val +
        "}";
    }
}
