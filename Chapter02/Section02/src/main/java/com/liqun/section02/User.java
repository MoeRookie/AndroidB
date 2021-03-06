package com.liqun.section02;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 519067123721295773L;
    public int userId;
    public String userName;
    public boolean isMale;

    public User(int userId, String userName, boolean isMale) {
        this.userId = userId;
        this.userName = userName;
        this.isMale = isMale;
    }
}
