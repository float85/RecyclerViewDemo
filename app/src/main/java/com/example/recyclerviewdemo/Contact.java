package com.example.recyclerviewdemo;

import java.io.Serializable;

public class Contact implements Serializable {
    String name;
    String mPhone;

    public Contact(String name, String mPhone) {
        this.name = name;
        this.mPhone = mPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }
}
