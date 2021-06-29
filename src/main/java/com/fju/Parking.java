package com.fju;

public class Parking {
    private int total = 0;
    private int numOfStations = 2;
    private Gate[] stations;

    public synchronized void reportCount(String name, int count) {
        int temp = total;
        System.out.println(name + "出入口共通行" + count + "輛車");
        temp = temp + count;
        System.out.println("目前通行車輛數：" + temp);
        total = temp;
    }

    public void startReport() {

        stations = new Gate[numOfStations];

        for (int i = 1; i <= numOfStations; i++) {
            stations[i - 1] = new Gate(this, i + "號");
        }

        for (int i = 0; i < numOfStations; i++) {
            stations[i].start();
        }
        for (int i = 0; i < numOfStations; i++) {
            try {
                stations[i].join();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("最後結果：");

        for (int i = 0; i < numOfStations; i++) {
            System.out.println(stations[i].name + ":" +
                    stations[i].total);
        }System.out.println("總車輛數：" + total);
    }

    public static void main(String[] argv) {
        Parking p = new Parking();
        p.startReport();
    }
}

