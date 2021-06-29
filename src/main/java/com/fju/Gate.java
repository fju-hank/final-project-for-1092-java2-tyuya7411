package com.fju;

public class Gate extends Thread{
    static int reportTimes = 1;
    int total = 0;
    Parking p;
    String name;
    public Gate(Parking p,String name) {
        this.p = p;
        this.name = name;
    }
    public void run() {
        for(int i = 0;i < reportTimes;i++) {

            int count = (int)(Math.random() * 30);
            p.reportCount(name,count);
            total += count;
        }
    }
}

