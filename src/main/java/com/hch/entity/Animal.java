package com.hch.entity;

import com.hch.service.Sayer;

public class Animal implements Sayer {
    @Override
    public void say(){
        System.out.println("animal say Woo...");
    }
}
