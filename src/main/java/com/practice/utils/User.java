package com.practice.utils;

import java.io.Serializable;

/**
 * CreatedBy cx
 * CreateTime 2018/7/12 19:57
 * Description
 */
public class User implements Serializable {
    private String userNo;
    private transient String password;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
