package com.hch.service.impl;

import com.hch.service.Sayer;

public class Say {

    Sayer sayer;

    public void setSayer(Sayer sayer) {
        this.sayer = sayer;
    }

    public void doSay(){
        sayer.say();
    }
}
